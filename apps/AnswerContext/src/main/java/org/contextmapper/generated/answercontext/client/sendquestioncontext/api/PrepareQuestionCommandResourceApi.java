/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.contextmapper.generated.answercontext.client.sendquestioncontext.api;

import org.contextmapper.generated.answercontext.client.sendquestioncontext.model.PrepareQuestionCommandDTO;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-27T13:18:36.474094+02:00[Europe/Paris]")
@Validated
@Tag(name = "prepare-question-command-resource", description = "the prepare-question-command-resource API")
public interface PrepareQuestionCommandResourceApi {

    /**
     * POST /api/prepare-question-commands
     *
     * @param prepareQuestionCommandDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createPrepareQuestionCommand",
        tags = { "prepare-question-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = PrepareQuestionCommandDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/prepare-question-commands",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<PrepareQuestionCommandDTO> createPrepareQuestionCommand(
        @Parameter(name = "PrepareQuestionCommandDTO", description = "", required = true) @Valid @RequestBody PrepareQuestionCommandDTO prepareQuestionCommandDTO
    );


    /**
     * DELETE /api/prepare-question-commands/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "deletePrepareQuestionCommand",
        tags = { "prepare-question-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/prepare-question-commands/{id}"
    )
    ResponseEntity<Void> deletePrepareQuestionCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    );


    /**
     * GET /api/prepare-question-commands
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getAllPrepareQuestionCommands",
        tags = { "prepare-question-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = PrepareQuestionCommandDTO.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/prepare-question-commands",
        produces = "*/*"
    )
    ResponseEntity<List<PrepareQuestionCommandDTO>> getAllPrepareQuestionCommands(
        
    );


    /**
     * GET /api/prepare-question-commands/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getPrepareQuestionCommand",
        tags = { "prepare-question-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = PrepareQuestionCommandDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/prepare-question-commands/{id}",
        produces = "*/*"
    )
    ResponseEntity<PrepareQuestionCommandDTO> getPrepareQuestionCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    );


    /**
     * PATCH /api/prepare-question-commands/{id}
     *
     * @param id  (required)
     * @param prepareQuestionCommandDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "partialUpdatePrepareQuestionCommand",
        tags = { "prepare-question-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = PrepareQuestionCommandDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/api/prepare-question-commands/{id}",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<PrepareQuestionCommandDTO> partialUpdatePrepareQuestionCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "PrepareQuestionCommandDTO", description = "", required = true) @Valid @RequestBody PrepareQuestionCommandDTO prepareQuestionCommandDTO
    );


    /**
     * PUT /api/prepare-question-commands/{id}
     *
     * @param id  (required)
     * @param prepareQuestionCommandDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "updatePrepareQuestionCommand",
        tags = { "prepare-question-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = PrepareQuestionCommandDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/prepare-question-commands/{id}",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<PrepareQuestionCommandDTO> updatePrepareQuestionCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "PrepareQuestionCommandDTO", description = "", required = true) @Valid @RequestBody PrepareQuestionCommandDTO prepareQuestionCommandDTO
    );

}
