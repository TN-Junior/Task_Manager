package com.tary.Task.Manager.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class EmailServiceIT {

    @Autowired
    private EmailService emailService;

    @Autowired
    private JavaMailSender mailSender;

    @Test
    void contextLoads() {
        assertThat(emailService).isNotNull();
        assertThat(mailSender).isNotNull();
    }
}
