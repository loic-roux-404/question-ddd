/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.contextmapper.generated.statcontext.client.evaluationcontext.api;

import org.contextmapper.generated.statcontext.client.evaluationcontext.model.EvaluationDTO;
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
@Tag(name = "query-handlers-resource", description = "the query-handlers-resource API")
public interface QueryHandlersResourceApi {

    /**
     * GET /api/handlers/view-tag-evaluation-query
     *
     * @param tagId  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "handleViewLeaderBoardQuery",
        tags = { "query-handlers-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = EvaluationDTO.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/handlers/view-tag-evaluation-query",
        produces = "*/*"
    )
    ResponseEntity<List<EvaluationDTO>> handleViewLeaderBoardQuery(
        @NotNull @Parameter(name = "tagId", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "tagId", required = true) Long tagId
    );


    /**
     * GET /api/handlers/view-user-evaluation-query
     *
     * @param userMail  (optional)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "handleViewUserEvaluationQuery",
        tags = { "query-handlers-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = EvaluationDTO.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/handlers/view-user-evaluation-query",
        produces = "*/*"
    )
    ResponseEntity<List<EvaluationDTO>> handleViewUserEvaluationQuery(
        @Parameter(name = "userMail", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "userMail", required = false) String userMail
    );

}
