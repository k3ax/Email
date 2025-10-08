package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import request.EmailRequest;
import service.EmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail/api")
public final class HelloEmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/sendSimpleMail")
    public void sendSimpleMail(@RequestBody EmailRequest request) {
        emailService.sendSimpleMail(
                request.getTo(),
                request.getSubject(),
                request.getBody()
        );
    }
}
