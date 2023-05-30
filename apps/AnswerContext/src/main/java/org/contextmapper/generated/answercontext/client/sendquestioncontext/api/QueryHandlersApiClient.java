package org.contextmapper.generated.answercontext.client.sendquestioncontext.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.contextmapper.generated.answercontext.client.sendquestioncontext.SendQuestionClientConfiguration;

@FeignClient(name="${queryHandlers.name:queryHandlers}", url="${queryHandlers.url:http://localhost:8094}", configuration = SendQuestionClientConfiguration.class)
public interface QueryHandlersApiClient extends QueryHandlersApi {
}
