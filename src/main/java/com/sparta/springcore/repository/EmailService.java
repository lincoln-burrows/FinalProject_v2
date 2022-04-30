package com.sparta.springcore.repository;


import com.sparta.springcore.model.EmailMessage;
import org.springframework.scheduling.annotation.Async;

public interface EmailService {

    @Async
    void sendEmail(EmailMessage emailMessage);

}