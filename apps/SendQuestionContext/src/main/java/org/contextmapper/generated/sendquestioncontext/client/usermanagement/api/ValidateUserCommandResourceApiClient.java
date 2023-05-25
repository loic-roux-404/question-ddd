package org.contextmapper.generated.sendquestioncontext.client.usermanagement.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.contextmapper.generated.sendquestioncontext.client.usermanagement.UserManagementClientConfiguration;

@FeignClient(name="${validateUserCommandResource.name:validateUserCommandResource}", url="${validateUserCommandResource.url:http://127.0.0.1:8081}", configuration = UserManagementClientConfiguration.class)
public interface ValidateUserCommandResourceApiClient extends ValidateUserCommandResourceApi {
}