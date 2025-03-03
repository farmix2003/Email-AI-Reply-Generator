package farmix.EmailAI.service;

import farmix.EmailAI.request.EmailRequest;
import reactor.core.publisher.Mono;

public interface EmailGeneratorService {
    Mono<String> generateEmailReply(EmailRequest emailRequest);
}
