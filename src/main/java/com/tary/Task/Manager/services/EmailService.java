package com.tary.Task.Manager.services;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender){
        this.mailSender = mailSender;
    }

    public void sendTaskCompletionEmail(String to, String taskDetails) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("Tarefa Concluída");
        message.setText("A seguinte tarefa foi concluída:\n\n" + taskDetails);
        mailSender.send(message);
        System.out.println("E-mail enviado para " + to);
    }
}
