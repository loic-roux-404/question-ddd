package org.contextmapper.generated.questioncontext.client.usermanagementcontext.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.contextmapper.generated.questioncontext.client.usermanagementcontext.UserManagementClientConfiguration;

@FeignClient(name="${viewUserByEmailCommandResource.name:viewUserByEmailCommandResource}", url="${viewUserByEmailCommandResource.url:http://localhost:8081}", configuration = UserManagementClientConfiguration.class)
public interface ViewUserByEmailCommandResourceApiClient extends ViewUserByEmailCommandResourceApi {
}
