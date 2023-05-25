/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.contextmapper.generated.sendquestioncontext.client.questioncontext.api;

import org.contextmapper.generated.sendquestioncontext.client.questioncontext.model.CreateResourceCommand;
import org.contextmapper.generated.sendquestioncontext.client.questioncontext.model.QuestionResourceDTO;
import org.contextmapper.generated.sendquestioncontext.client.questioncontext.model.ValidateResourceTagLinkageCommand;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-25T13:29:24.478064+02:00[Europe/Paris]")
@Validated
@Tag(name = "resource-command-handler-resource", description = "the resource-command-handler-resource API")
public interface ResourceCommandHandlerResourceApi {

    /**
     * POST /api/handlers/resource-command
     *
     * @param questionResourceDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "handle",
        tags = { "resource-command-handler-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = CreateResourceCommand.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/handlers/resource-command",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<CreateResourceCommand> handle(
        @Parameter(name = "QuestionResourceDTO", description = "", required = true) @Valid @RequestBody QuestionResourceDTO questionResourceDTO
    );


    /**
     * POST /api/handlers/validate-resource-command
     *
     * @param command  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "handleValidateResource",
        tags = { "resource-command-handler-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ValidateResourceTagLinkageCommand.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/handlers/validate-resource-command",
        produces = "*/*"
    )
    ResponseEntity<ValidateResourceTagLinkageCommand> handleValidateResource(
        @NotNull @Parameter(name = "command", description = "", required = true, in = ParameterIn.QUERY) @Valid ValidateResourceTagLinkageCommand command
    );

}
