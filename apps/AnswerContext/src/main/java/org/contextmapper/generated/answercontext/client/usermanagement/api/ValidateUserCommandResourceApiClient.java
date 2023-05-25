package org.contextmapper.generated.answercontext.client.usermanagement.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.contextmapper.generated.answercontext.client.usermanagement.ClientConfiguration;

@FeignClient(name="${validateUserCommandResource.name:validateUserCommandResource}", url="${validateUserCommandResource.url:http://127.0.0.1:8081}", configuration = ClientConfiguration.class)
public interface ValidateUserCommandResourceApiClient extends ValidateUserCommandResourceApi {
}