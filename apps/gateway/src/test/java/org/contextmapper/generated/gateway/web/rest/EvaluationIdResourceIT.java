package org.contextmapper.generated.gateway.web.rest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.contextmapper.generated.gateway.IntegrationTest;
import org.contextmapper.generated.gateway.domain.EvaluationId;
import org.contextmapper.generated.gateway.repository.EntityManager;
import org.contextmapper.generated.gateway.repository.EvaluationIdRepository;
import org.contextmapper.generated.gateway.service.dto.EvaluationIdDTO;
import org.contextmapper.generated.gateway.service.mapper.EvaluationIdMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.reactive.server.WebTestClient;

/**
 * Integration tests for the {@link EvaluationIdResource} REST controller.
 */
@IntegrationTest
@AutoConfigureWebTestClient(timeout = IntegrationTest.DEFAULT_ENTITY_TIMEOUT)
@WithMockUser
class EvaluationIdResourceIT {

    private static final Integer DEFAULT_EVALUATION_ID = 1;
    private static final Integer UPDATED_EVALUATION_ID = 2;

    private static final String ENTITY_API_URL = "/api/evaluation-ids";
    private static final String ENTITY_API_URL_ID = ENTITY_API_URL + "/{id}";

    private static Random random = new Random();
    private static AtomicLong count = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));

    @Autowired
    private EvaluationIdRepository evaluationIdRepository;

    @Autowired
    private EvaluationIdMapper evaluationIdMapper;

    @Autowired
    private EntityManager em;

    @Autowired
    private WebTestClient webTestClient;

    private EvaluationId evaluationId;

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static EvaluationId createEntity(EntityManager em) {
        EvaluationId evaluationId = new EvaluationId().evaluationId(DEFAULT_EVALUATION_ID);
        return evaluationId;
    }

    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static EvaluationId createUpdatedEntity(EntityManager em) {
        EvaluationId evaluationId = new EvaluationId().evaluationId(UPDATED_EVALUATION_ID);
        return evaluationId;
    }

    public static void deleteEntities(EntityManager em) {
        try {
            em.deleteAll(EvaluationId.class).block();
        } catch (Exception e) {
            // It can fail, if other entities are still referring this - it will be removed later.
        }
    }

    @AfterEach
    public void cleanup() {
        deleteEntities(em);
    }

    @BeforeEach
    public void initTest() {
        deleteEntities(em);
        evaluationId = createEntity(em);
    }

    @Test
    void getAllEvaluationIdsAsStream() {
        // Initialize the database
        evaluationIdRepository.save(evaluationId).block();

        List<EvaluationId> evaluationIdList = webTestClient
            .get()
            .uri(ENTITY_API_URL)
            .accept(MediaType.APPLICATION_NDJSON)
            .exchange()
            .expectStatus()
            .isOk()
            .expectHeader()
            .contentTypeCompatibleWith(MediaType.APPLICATION_NDJSON)
            .returnResult(EvaluationIdDTO.class)
            .getResponseBody()
            .map(evaluationIdMapper::toEntity)
            .filter(evaluationId::equals)
            .collectList()
            .block(Duration.ofSeconds(5));

        assertThat(evaluationIdList).isNotNull();
        assertThat(evaluationIdList).hasSize(1);
        EvaluationId testEvaluationId = evaluationIdList.get(0);
        assertThat(testEvaluationId.getEvaluationId()).isEqualTo(DEFAULT_EVALUATION_ID);
    }

    @Test
    void getAllEvaluationIds() {
        // Initialize the database
        evaluationIdRepository.save(evaluationId).block();

        // Get all the evaluationIdList
        webTestClient
            .get()
            .uri(ENTITY_API_URL + "?sort=id,desc")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus()
            .isOk()
            .expectHeader()
            .contentType(MediaType.APPLICATION_JSON)
            .expectBody()
            .jsonPath("$.[*].id")
            .value(hasItem(evaluationId.getId().intValue()))
            .jsonPath("$.[*].evaluationId")
            .value(hasItem(DEFAULT_EVALUATION_ID));
    }

    @Test
    void getEvaluationId() {
        // Initialize the database
        evaluationIdRepository.save(evaluationId).block();

        // Get the evaluationId
        webTestClient
            .get()
            .uri(ENTITY_API_URL_ID, evaluationId.getId())
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus()
            .isOk()
            .expectHeader()
            .contentType(MediaType.APPLICATION_JSON)
            .expectBody()
            .jsonPath("$.id")
            .value(is(evaluationId.getId().intValue()))
            .jsonPath("$.evaluationId")
            .value(is(DEFAULT_EVALUATION_ID));
    }

    @Test
    void getNonExistingEvaluationId() {
        // Get the evaluationId
        webTestClient
            .get()
            .uri(ENTITY_API_URL_ID, Long.MAX_VALUE)
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus()
            .isNotFound();
    }
}