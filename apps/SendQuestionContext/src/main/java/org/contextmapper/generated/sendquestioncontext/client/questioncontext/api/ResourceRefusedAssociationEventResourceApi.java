/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.contextmapper.generated.sendquestioncontext.client.questioncontext.api;

import org.contextmapper.generated.sendquestioncontext.client.questioncontext.model.ResourceRefusedAssociationEventDTO;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-27T13:17:37.306479+02:00[Europe/Paris]")
@Validated
@Tag(name = "resource-refused-association-event-resource", description = "the resource-refused-association-event-resource API")
public interface ResourceRefusedAssociationEventResourceApi {

    /**
     * GET /api/resource-refused-association-events
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getAllResourceRefusedAssociationEvents",
        tags = { "resource-refused-association-event-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = ResourceRefusedAssociationEventDTO.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/resource-refused-association-events",
        produces = "*/*"
    )
    ResponseEntity<List<ResourceRefusedAssociationEventDTO>> getAllResourceRefusedAssociationEvents(
        
    );


    /**
     * GET /api/resource-refused-association-events/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getResourceRefusedAssociationEvent",
        tags = { "resource-refused-association-event-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ResourceRefusedAssociationEventDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/resource-refused-association-events/{id}",
        produces = "*/*"
    )
    ResponseEntity<ResourceRefusedAssociationEventDTO> getResourceRefusedAssociationEvent(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    );

}
