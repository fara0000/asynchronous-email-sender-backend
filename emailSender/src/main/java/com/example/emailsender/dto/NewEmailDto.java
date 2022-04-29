package com.example.emailsender.dto;

import lombok.Data;

@Data
public class NewEmailDto {
    String emailTo;
    String subject;
    String messageBody;
}
