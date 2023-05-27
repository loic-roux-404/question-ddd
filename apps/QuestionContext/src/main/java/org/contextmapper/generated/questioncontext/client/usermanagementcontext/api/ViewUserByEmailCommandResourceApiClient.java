package org.contextmapper.generated.questioncontext.client.usermanagementcontext.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.contextmapper.generated.questioncontext.client.usermanagementcontext.ClientConfiguration;

@FeignClient(name="${viewUserByEmailCommandResource.name:viewUserByEmailCommandResource}", url="${viewUserByEmailCommandResource.url:http://localhost:8081}", configuration = ClientConfiguration.class)
public interface ViewUserByEmailCommandResourceApiClient extends ViewUserByEmailCommandResourceApi {
}