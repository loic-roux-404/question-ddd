/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.contextmapper.generated.sendquestioncontext.client.usermanagementcontext.api;

import org.contextmapper.generated.sendquestioncontext.client.usermanagementcontext.model.UserInfosDTO;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-27T16:47:18.111395+02:00[Europe/Paris]")
@Validated
@Tag(name = "query-handler-resource", description = "the query-handler-resource API")
public interface QueryHandlerResourceApi {

    /**
     * GET /api/handlers/view-user-query
     *
     * @param mail  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "handleViewUserByMail",
        tags = { "query-handler-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = UserInfosDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/handlers/view-user-query",
        produces = "*/*"
    )
    ResponseEntity<UserInfosDTO> handleViewUserByMail(
        @NotNull @Parameter(name = "mail", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "mail", required = true) String mail
    );

}
