package farmix.EmailAI.service;

import farmix.EmailAI.request.EmailRequest;

public interface EmailGeneratorService {
    String generateEmailReply(EmailRequest emailRequest);
}
