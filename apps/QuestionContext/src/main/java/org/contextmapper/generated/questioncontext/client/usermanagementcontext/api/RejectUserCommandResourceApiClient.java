package org.contextmapper.generated.questioncontext.client.usermanagementcontext.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.contextmapper.generated.questioncontext.client.usermanagementcontext.ClientConfiguration;

@FeignClient(name="${rejectUserCommandResource.name:rejectUserCommandResource}", url="${rejectUserCommandResource.url:http://localhost:8081}", configuration = ClientConfiguration.class)
public interface RejectUserCommandResourceApiClient extends RejectUserCommandResourceApi {
}
