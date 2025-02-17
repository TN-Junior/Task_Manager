package com.tary.Task.Manager.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EmailServiceTest {

    @Mock
    private JavaMailSender mailSender;

    @InjectMocks
    private EmailService emailService;

    @Test
    void testSendTaskCompletionEmail() {
        // Arrange
        String recipient = "test@example.com";
        String taskDetails = "Tarefa de Teste Concluída";

        // Act
        emailService.sendTaskCompletionEmail(recipient, taskDetails);

        // Assert
        verify(mailSender, times(1)).send(any(SimpleMailMessage.class));
    }
}
