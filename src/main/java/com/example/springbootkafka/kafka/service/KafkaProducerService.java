package com.example.springbootkafka.kafka.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaProducerService {

    private final KafkaTemplate kafkaTemplate;

    public void publishEvent(String topic, String event) {
        log.info("publishing kafka event [{}] [{}]", topic, event);
        kafkaTemplate.send(topic, event);
    }
}
