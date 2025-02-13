package com.tary.Task.Manager.task;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class TaskEventProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public TaskEventProducer(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendTaskEvent(String event){
        kafkaTemplate.send("task-events", event);
        System.out.println("Evento enviado para Kafka: " + event);
    }


}
