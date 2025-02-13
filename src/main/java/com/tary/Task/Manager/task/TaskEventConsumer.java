package com.tary.Task.Manager.task;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Service;

@Service
public class TaskEventConsumer {

    public void listen(ConsumerRecord<String, String> record){
        System.out.println("Evento consumido: " + record.value());
    }
}
