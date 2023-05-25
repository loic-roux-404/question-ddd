/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.contextmapper.generated.sendquestioncontext.client.questioncontext.api;

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
@Tag(name = "validate-resource-tag-linkage-command-resource", description = "the validate-resource-tag-linkage-command-resource API")
public interface ValidateResourceTagLinkageCommandResourceApi {

    /**
     * POST /api/validate-resource-tag-linkage-commands
     *
     * @param validateResourceTagLinkageCommand  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createValidateResourceTagLinkageCommand",
        tags = { "validate-resource-tag-linkage-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ValidateResourceTagLinkageCommand.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/validate-resource-tag-linkage-commands",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<ValidateResourceTagLinkageCommand> createValidateResourceTagLinkageCommand(
        @Parameter(name = "ValidateResourceTagLinkageCommand", description = "", required = true) @Valid @RequestBody ValidateResourceTagLinkageCommand validateResourceTagLinkageCommand
    );


    /**
     * DELETE /api/validate-resource-tag-linkage-commands/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "deleteValidateResourceTagLinkageCommand",
        tags = { "validate-resource-tag-linkage-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/validate-resource-tag-linkage-commands/{id}"
    )
    ResponseEntity<Void> deleteValidateResourceTagLinkageCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    );


    /**
     * GET /api/validate-resource-tag-linkage-commands
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getAllValidateResourceTagLinkageCommands",
        tags = { "validate-resource-tag-linkage-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = ValidateResourceTagLinkageCommand.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/validate-resource-tag-linkage-commands",
        produces = "*/*"
    )
    ResponseEntity<List<ValidateResourceTagLinkageCommand>> getAllValidateResourceTagLinkageCommands(
        
    );


    /**
     * GET /api/validate-resource-tag-linkage-commands/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getValidateResourceTagLinkageCommand",
        tags = { "validate-resource-tag-linkage-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ValidateResourceTagLinkageCommand.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/validate-resource-tag-linkage-commands/{id}",
        produces = "*/*"
    )
    ResponseEntity<ValidateResourceTagLinkageCommand> getValidateResourceTagLinkageCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    );


    /**
     * PATCH /api/validate-resource-tag-linkage-commands/{id}
     *
     * @param id  (required)
     * @param validateResourceTagLinkageCommand  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "partialUpdateValidateResourceTagLinkageCommand",
        tags = { "validate-resource-tag-linkage-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ValidateResourceTagLinkageCommand.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/api/validate-resource-tag-linkage-commands/{id}",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<ValidateResourceTagLinkageCommand> partialUpdateValidateResourceTagLinkageCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "ValidateResourceTagLinkageCommand", description = "", required = true) @Valid @RequestBody ValidateResourceTagLinkageCommand validateResourceTagLinkageCommand
    );


    /**
     * PUT /api/validate-resource-tag-linkage-commands/{id}
     *
     * @param id  (required)
     * @param validateResourceTagLinkageCommand  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "updateValidateResourceTagLinkageCommand",
        tags = { "validate-resource-tag-linkage-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ValidateResourceTagLinkageCommand.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/validate-resource-tag-linkage-commands/{id}",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<ValidateResourceTagLinkageCommand> updateValidateResourceTagLinkageCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "ValidateResourceTagLinkageCommand", description = "", required = true) @Valid @RequestBody ValidateResourceTagLinkageCommand validateResourceTagLinkageCommand
    );

}