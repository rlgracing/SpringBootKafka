package com.example.springbootkafka.rest;

import com.example.springbootkafka.domain.KafkaRequest;
import com.example.springbootkafka.kafka.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/event")
public class EventController {

    private final KafkaProducerService kafkaProducerService;

    @PostMapping("/publish")
    public ResponseEntity<String> publishEvent(@RequestBody KafkaRequest kafkaRequest) {
        log.info("it worked! [{}]", kafkaRequest);

        kafkaProducerService.publishEvent(kafkaRequest.getTopic(), kafkaRequest.getEvent());

        return ResponseEntity.ok().build();
    }
}
