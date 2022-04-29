package com.example.emailsender.controller;

import com.example.emailsender.dto.NewEmailDto;
import com.example.emailsender.services.EmailSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.mail.MessagingException;

@RestController
@RequiredArgsConstructor
public class EmailSenderController {
    private final EmailSenderService emailSenderService;

    @RequestMapping(value = "/email", method = RequestMethod.GET)
    public void getMails() throws MessagingException {
        NewEmailDto newEmailDto = new NewEmailDto();
        newEmailDto.setEmailTo("fexri_imanzade@mail.ru");
        newEmailDto.setSubject("hey");
        newEmailDto.setMessageBody("ну наконец-то");
        emailSenderService.sendEmail(newEmailDto);
    }
}
