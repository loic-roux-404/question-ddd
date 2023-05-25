/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.contextmapper.generated.answercontext.client.sendquestioncontext.api;

import org.contextmapper.generated.answercontext.client.sendquestioncontext.model.NotifiedQuestionDTO;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-25T18:07:12.588883+02:00[Europe/Paris]")
@Validated
@Tag(name = "notified-question-resource", description = "the notified-question-resource API")
public interface NotifiedQuestionResourceApi {

    /**
     * POST /api/notified-questions
     *
     * @param notifiedQuestionDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createNotifiedQuestion",
        tags = { "notified-question-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = NotifiedQuestionDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/notified-questions",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<NotifiedQuestionDTO> createNotifiedQuestion(
        @Parameter(name = "NotifiedQuestionDTO", description = "", required = true) @Valid @RequestBody NotifiedQuestionDTO notifiedQuestionDTO
    );


    /**
     * DELETE /api/notified-questions/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "deleteNotifiedQuestion",
        tags = { "notified-question-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/notified-questions/{id}"
    )
    ResponseEntity<Void> deleteNotifiedQuestion(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    );


    /**
     * GET /api/notified-questions
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getAllNotifiedQuestions",
        tags = { "notified-question-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = NotifiedQuestionDTO.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/notified-questions",
        produces = "*/*"
    )
    ResponseEntity<List<NotifiedQuestionDTO>> getAllNotifiedQuestions(
        
    );


    /**
     * GET /api/notified-questions/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getNotifiedQuestion",
        tags = { "notified-question-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = NotifiedQuestionDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/notified-questions/{id}",
        produces = "*/*"
    )
    ResponseEntity<NotifiedQuestionDTO> getNotifiedQuestion(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    );


    /**
     * PATCH /api/notified-questions/{id}
     *
     * @param id  (required)
     * @param notifiedQuestionDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "partialUpdateNotifiedQuestion",
        tags = { "notified-question-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = NotifiedQuestionDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/api/notified-questions/{id}",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<NotifiedQuestionDTO> partialUpdateNotifiedQuestion(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "NotifiedQuestionDTO", description = "", required = true) @Valid @RequestBody NotifiedQuestionDTO notifiedQuestionDTO
    );


    /**
     * PUT /api/notified-questions/{id}
     *
     * @param id  (required)
     * @param notifiedQuestionDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "updateNotifiedQuestion",
        tags = { "notified-question-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = NotifiedQuestionDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/notified-questions/{id}",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<NotifiedQuestionDTO> updateNotifiedQuestion(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "NotifiedQuestionDTO", description = "", required = true) @Valid @RequestBody NotifiedQuestionDTO notifiedQuestionDTO
    );

}