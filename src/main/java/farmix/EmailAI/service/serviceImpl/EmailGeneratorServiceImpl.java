package farmix.EmailAI.service.serviceImpl;

import farmix.EmailAI.request.EmailRequest;
import farmix.EmailAI.service.EmailGeneratorService;
import org.springframework.stereotype.Service;

@Service
public class EmailGeneratorServiceImpl implements EmailGeneratorService {

    @Override
    public String generateEmailReply(EmailRequest emailRequest) {

        String prompt = promptBuilder(emailRequest);

        return "";
    }

    private String promptBuilder(EmailRequest emailRequest) {
        StringBuilder prompt = new StringBuilder();
        prompt.append("Please generate the professional email reply for the following email, Do not use any subject line.");
        if (emailRequest.getTone() != null && !emailRequest.getTone().isEmpty()){
            prompt.append("Use a ").append(emailRequest.getTone()).append(" tone");
        }
        prompt.append("\nOriginal email:\n").append(emailRequest.getEmailContent());
        return prompt.toString();
    }
}
