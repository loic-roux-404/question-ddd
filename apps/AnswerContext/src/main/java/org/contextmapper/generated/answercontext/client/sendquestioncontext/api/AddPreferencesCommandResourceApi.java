/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.contextmapper.generated.answercontext.client.sendquestioncontext.api;

import org.contextmapper.generated.answercontext.client.sendquestioncontext.model.AddPreferencesCommandDTO;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-30T12:13:14.383620+02:00[Europe/Paris]")
@Validated
@Tag(name = "add-preferences-command-resource", description = "the add-preferences-command-resource API")
public interface AddPreferencesCommandResourceApi {

    /**
     * POST /api/add-preferences-commands
     *
     * @param addPreferencesCommandDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createAddPreferencesCommand",
        tags = { "add-preferences-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = AddPreferencesCommandDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/add-preferences-commands",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<AddPreferencesCommandDTO> createAddPreferencesCommand(
        @Parameter(name = "AddPreferencesCommandDTO", description = "", required = true) @Valid @RequestBody AddPreferencesCommandDTO addPreferencesCommandDTO
    );


    /**
     * DELETE /api/add-preferences-commands/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "deleteAddPreferencesCommand",
        tags = { "add-preferences-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/add-preferences-commands/{id}"
    )
    ResponseEntity<Void> deleteAddPreferencesCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    );


    /**
     * GET /api/add-preferences-commands/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getAddPreferencesCommand",
        tags = { "add-preferences-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = AddPreferencesCommandDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/add-preferences-commands/{id}",
        produces = "*/*"
    )
    ResponseEntity<AddPreferencesCommandDTO> getAddPreferencesCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    );


    /**
     * GET /api/add-preferences-commands
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getAllAddPreferencesCommands",
        tags = { "add-preferences-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = AddPreferencesCommandDTO.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/add-preferences-commands",
        produces = "*/*"
    )
    ResponseEntity<List<AddPreferencesCommandDTO>> getAllAddPreferencesCommands(
        
    );


    /**
     * PATCH /api/add-preferences-commands/{id}
     *
     * @param id  (required)
     * @param addPreferencesCommandDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "partialUpdateAddPreferencesCommand",
        tags = { "add-preferences-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = AddPreferencesCommandDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/api/add-preferences-commands/{id}",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<AddPreferencesCommandDTO> partialUpdateAddPreferencesCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "AddPreferencesCommandDTO", description = "", required = true) @Valid @RequestBody AddPreferencesCommandDTO addPreferencesCommandDTO
    );


    /**
     * PUT /api/add-preferences-commands/{id}
     *
     * @param id  (required)
     * @param addPreferencesCommandDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "updateAddPreferencesCommand",
        tags = { "add-preferences-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = AddPreferencesCommandDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/add-preferences-commands/{id}",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<AddPreferencesCommandDTO> updateAddPreferencesCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "AddPreferencesCommandDTO", description = "", required = true) @Valid @RequestBody AddPreferencesCommandDTO addPreferencesCommandDTO
    );

}
