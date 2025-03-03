package farmix.EmailAI.controller;

import farmix.EmailAI.request.EmailRequest;
import farmix.EmailAI.service.EmailGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/email")
public class EmailController {

    @Autowired
    private EmailGeneratorService emailGeneratorService;

    @PostMapping
    public ResponseEntity<Mono<String>> generateEmail(@RequestBody EmailRequest emailRequest){

        Mono<String> response = emailGeneratorService.generateEmailReply(emailRequest);

        return ResponseEntity.ok(response);
    }


}
