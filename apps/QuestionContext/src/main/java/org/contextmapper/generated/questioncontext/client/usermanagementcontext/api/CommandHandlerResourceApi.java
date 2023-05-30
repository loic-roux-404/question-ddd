/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.contextmapper.generated.questioncontext.client.usermanagementcontext.api;

import org.contextmapper.generated.questioncontext.client.usermanagementcontext.model.RegisterCommandDTO;
import org.contextmapper.generated.questioncontext.client.usermanagementcontext.model.UserInfosDTO;
import org.contextmapper.generated.questioncontext.client.usermanagementcontext.model.ValidateUserCommandDTO;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-30T12:08:54.981704+02:00[Europe/Paris]")
@Validated
@Tag(name = "command-handler-resource", description = "the command-handler-resource API")
public interface CommandHandlerResourceApi {

    /**
     * POST /api/handlers/validate-user-command
     *
     * @param validateUserCommandDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "handleRegisterCommand",
        tags = { "command-handler-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = UserInfosDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/handlers/validate-user-command",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<UserInfosDTO> handleRegisterCommand(
        @Parameter(name = "ValidateUserCommandDTO", description = "", required = true) @Valid @RequestBody ValidateUserCommandDTO validateUserCommandDTO
    );


    /**
     * POST /api/handlers/register-command
     *
     * @param registerCommandDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "handleRegisterCommand1",
        tags = { "command-handler-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = RegisterCommandDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/handlers/register-command",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<RegisterCommandDTO> handleRegisterCommand1(
        @Parameter(name = "RegisterCommandDTO", description = "", required = true) @Valid @RequestBody RegisterCommandDTO registerCommandDTO
    );

}
