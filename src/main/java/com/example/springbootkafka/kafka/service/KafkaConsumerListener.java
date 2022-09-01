package com.example.springbootkafka.kafka.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Slf4j
@Component
public class KafkaConsumerListener {

    @KafkaListener(topics = "quickstart-events", groupId = "group", containerFactory = "kafkaListener")
    public void listenTopic(ConsumerRecord<String, String> event) {
        log.info("event received: [{}]", event.value());
    }
}
