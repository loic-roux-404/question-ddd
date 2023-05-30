/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.contextmapper.generated.statcontext.client.evaluationcontext.api;

import org.contextmapper.generated.statcontext.client.evaluationcontext.model.AnswerCheckedDTO;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-30T11:22:06.881122+02:00[Europe/Paris]")
@Validated
@Tag(name = "answer-checked-resource", description = "the answer-checked-resource API")
public interface AnswerCheckedResourceApi {

    /**
     * POST /api/answer-checkeds
     *
     * @param answerCheckedDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createAnswerChecked",
        tags = { "answer-checked-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = AnswerCheckedDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/answer-checkeds",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<AnswerCheckedDTO> createAnswerChecked(
        @Parameter(name = "AnswerCheckedDTO", description = "", required = true) @Valid @RequestBody AnswerCheckedDTO answerCheckedDTO
    );


    /**
     * DELETE /api/answer-checkeds/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "deleteAnswerChecked",
        tags = { "answer-checked-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/answer-checkeds/{id}"
    )
    ResponseEntity<Void> deleteAnswerChecked(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    );


    /**
     * GET /api/answer-checkeds
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getAllAnswerCheckeds",
        tags = { "answer-checked-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = AnswerCheckedDTO.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/answer-checkeds",
        produces = "*/*"
    )
    ResponseEntity<List<AnswerCheckedDTO>> getAllAnswerCheckeds(
        
    );


    /**
     * GET /api/answer-checkeds/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getAnswerChecked",
        tags = { "answer-checked-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = AnswerCheckedDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/answer-checkeds/{id}",
        produces = "*/*"
    )
    ResponseEntity<AnswerCheckedDTO> getAnswerChecked(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    );


    /**
     * PATCH /api/answer-checkeds/{id}
     *
     * @param id  (required)
     * @param answerCheckedDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "partialUpdateAnswerChecked",
        tags = { "answer-checked-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = AnswerCheckedDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/api/answer-checkeds/{id}",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<AnswerCheckedDTO> partialUpdateAnswerChecked(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "AnswerCheckedDTO", description = "", required = true) @Valid @RequestBody AnswerCheckedDTO answerCheckedDTO
    );


    /**
     * PUT /api/answer-checkeds/{id}
     *
     * @param id  (required)
     * @param answerCheckedDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "updateAnswerChecked",
        tags = { "answer-checked-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = AnswerCheckedDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/answer-checkeds/{id}",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<AnswerCheckedDTO> updateAnswerChecked(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "AnswerCheckedDTO", description = "", required = true) @Valid @RequestBody AnswerCheckedDTO answerCheckedDTO
    );

}
