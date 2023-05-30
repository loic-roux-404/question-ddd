package org.contextmapper.generated.questioncontext.client.skillcontext.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.contextmapper.generated.questioncontext.client.skillcontext.SkillContextClientConfiguration;

@FeignClient(name="${createTagCommandResource.name:createTagCommandResource}", url="${createTagCommandResource.url:http://localhost:8093}", configuration = SkillContextClientConfiguration.class)
public interface CreateTagCommandResourceApiClient extends CreateTagCommandResourceApi {
}
