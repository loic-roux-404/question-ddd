/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.contextmapper.generated.sendquestioncontext.client.questioncontext.api;

import org.contextmapper.generated.sendquestioncontext.client.questioncontext.model.RejectResourceTagCommand;
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
@Tag(name = "reject-resource-tag-command-resource", description = "the reject-resource-tag-command-resource API")
public interface RejectResourceTagCommandResourceApi {

    /**
     * POST /api/reject-resource-tag-commands
     *
     * @param rejectResourceTagCommand  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createRejectResourceTagCommand",
        tags = { "reject-resource-tag-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = RejectResourceTagCommand.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/reject-resource-tag-commands",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<RejectResourceTagCommand> createRejectResourceTagCommand(
        @Parameter(name = "RejectResourceTagCommand", description = "", required = true) @Valid @RequestBody RejectResourceTagCommand rejectResourceTagCommand
    );


    /**
     * DELETE /api/reject-resource-tag-commands/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "deleteRejectResourceTagCommand",
        tags = { "reject-resource-tag-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/reject-resource-tag-commands/{id}"
    )
    ResponseEntity<Void> deleteRejectResourceTagCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    );


    /**
     * GET /api/reject-resource-tag-commands
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getAllRejectResourceTagCommands",
        tags = { "reject-resource-tag-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = RejectResourceTagCommand.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/reject-resource-tag-commands",
        produces = "*/*"
    )
    ResponseEntity<List<RejectResourceTagCommand>> getAllRejectResourceTagCommands(
        
    );


    /**
     * GET /api/reject-resource-tag-commands/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getRejectResourceTagCommand",
        tags = { "reject-resource-tag-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = RejectResourceTagCommand.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/reject-resource-tag-commands/{id}",
        produces = "*/*"
    )
    ResponseEntity<RejectResourceTagCommand> getRejectResourceTagCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    );


    /**
     * PATCH /api/reject-resource-tag-commands/{id}
     *
     * @param id  (required)
     * @param rejectResourceTagCommand  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "partialUpdateRejectResourceTagCommand",
        tags = { "reject-resource-tag-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = RejectResourceTagCommand.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/api/reject-resource-tag-commands/{id}",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<RejectResourceTagCommand> partialUpdateRejectResourceTagCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "RejectResourceTagCommand", description = "", required = true) @Valid @RequestBody RejectResourceTagCommand rejectResourceTagCommand
    );


    /**
     * PUT /api/reject-resource-tag-commands/{id}
     *
     * @param id  (required)
     * @param rejectResourceTagCommand  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "updateRejectResourceTagCommand",
        tags = { "reject-resource-tag-command-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = RejectResourceTagCommand.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/reject-resource-tag-commands/{id}",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<RejectResourceTagCommand> updateRejectResourceTagCommand(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "RejectResourceTagCommand", description = "", required = true) @Valid @RequestBody RejectResourceTagCommand rejectResourceTagCommand
    );

}
