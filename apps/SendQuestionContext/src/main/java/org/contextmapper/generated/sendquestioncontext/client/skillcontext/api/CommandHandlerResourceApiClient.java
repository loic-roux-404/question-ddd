package org.contextmapper.generated.sendquestioncontext.client.skillcontext.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.contextmapper.generated.sendquestioncontext.client.skillcontext.ClientConfiguration;

@FeignClient(name="${commandHandlerResource.name:commandHandlerResource}", url="${commandHandlerResource.url:http://localhost:8083}", configuration = ClientConfiguration.class)
public interface CommandHandlerResourceApiClient extends CommandHandlerResourceApi {
}
