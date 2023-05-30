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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-30T12:11:16.333990+02:00[Europe/Paris]")
@Validated
@Tag(name = "user-infos-resource", description = "the user-infos-resource API")
public interface UserInfosResourceApi {

    /**
     * POST /api/user-infos
     *
     * @param userInfosDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createUserInfos",
        tags = { "user-infos-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = UserInfosDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/user-infos",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<UserInfosDTO> createUserInfos(
        @Parameter(name = "UserInfosDTO", description = "", required = true) @Valid @RequestBody UserInfosDTO userInfosDTO
    );


    /**
     * DELETE /api/user-infos/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "deleteUserInfos",
        tags = { "user-infos-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/user-infos/{id}"
    )
    ResponseEntity<Void> deleteUserInfos(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    );


    /**
     * GET /api/user-infos
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getAllUserInfos",
        tags = { "user-infos-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = UserInfosDTO.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/user-infos",
        produces = "*/*"
    )
    ResponseEntity<List<UserInfosDTO>> getAllUserInfos(
        
    );


    /**
     * GET /api/user-infos/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getUserInfos",
        tags = { "user-infos-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = UserInfosDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/user-infos/{id}",
        produces = "*/*"
    )
    ResponseEntity<UserInfosDTO> getUserInfos(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    );


    /**
     * PATCH /api/user-infos/{id}
     *
     * @param id  (required)
     * @param userInfosDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "partialUpdateUserInfos",
        tags = { "user-infos-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = UserInfosDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/api/user-infos/{id}",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<UserInfosDTO> partialUpdateUserInfos(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "UserInfosDTO", description = "", required = true) @Valid @RequestBody UserInfosDTO userInfosDTO
    );


    /**
     * PUT /api/user-infos/{id}
     *
     * @param id  (required)
     * @param userInfosDTO  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "updateUserInfos",
        tags = { "user-infos-resource" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = UserInfosDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/user-infos/{id}",
        produces = "*/*",
        consumes = "application/json"
    )
    ResponseEntity<UserInfosDTO> updateUserInfos(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "UserInfosDTO", description = "", required = true) @Valid @RequestBody UserInfosDTO userInfosDTO
    );

}
