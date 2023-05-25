package org.contextmapper.generated.sendquestioncontext.client.usermanagement.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.contextmapper.generated.sendquestioncontext.client.usermanagement.ClientConfiguration;

@FeignClient(name="${userInfosResource.name:userInfosResource}", url="${userInfosResource.url:http://127.0.0.1:8081}", configuration = ClientConfiguration.class)
public interface UserInfosResourceApiClient extends UserInfosResourceApi {
}
