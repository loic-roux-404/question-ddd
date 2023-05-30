/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.contextmapper.generated.questioncontext.client.usermanagementcontext.api;

import org.contextmapper.generated.questioncontext.client.usermanagementcontext.model.RegisterCommandDTO;
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
@Tag(name = "register-command-resource", description = "the register-command-resource API")
public interface RegisterCommandResourceApi {

    /**
     * POST /api/register-commands
     *
     * @param registerCommandDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createRegisterCommand",
        tags = { "register-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = RegisterCommandDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/register-commands",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<RegisterCommandDTO> createRegisterCommand(
        @Parameter(name = "RegisterCommandDTO", description = "", required = true) @Valid @RequestBody RegisterCommandDTO registerCommandDTO
    );


    /**
     * DELETE /api/register-commands/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "deleteRegisterCommand",
        tags = { "register-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/register-commands/{id}"
    )
    ResponseEntity<Void> deleteRegisterCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    );


    /**
     * GET /api/register-commands
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getAllRegisterCommands",
        tags = { "register-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = RegisterCommandDTO.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/register-commands",
        produces = "*/*"
    )
    ResponseEntity<List<RegisterCommandDTO>> getAllRegisterCommands(
        
    );


    /**
     * GET /api/register-commands/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getRegisterCommand",
        tags = { "register-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = RegisterCommandDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/register-commands/{id}",
        produces = "*/*"
    )
    ResponseEntity<RegisterCommandDTO> getRegisterCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    );


    /**
     * PATCH /api/register-commands/{id}
     *
     * @param id  (required)
     * @param registerCommandDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "partialUpdateRegisterCommand",
        tags = { "register-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = RegisterCommandDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/api/register-commands/{id}",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<RegisterCommandDTO> partialUpdateRegisterCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "RegisterCommandDTO", description = "", required = true) @Valid @RequestBody RegisterCommandDTO registerCommandDTO
    );


    /**
     * PUT /api/register-commands/{id}
     *
     * @param id  (required)
     * @param registerCommandDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "updateRegisterCommand",
        tags = { "register-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = RegisterCommandDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/register-commands/{id}",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<RegisterCommandDTO> updateRegisterCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "RegisterCommandDTO", description = "", required = true) @Valid @RequestBody RegisterCommandDTO registerCommandDTO
    );

}
