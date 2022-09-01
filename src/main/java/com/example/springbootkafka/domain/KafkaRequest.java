package com.example.springbootkafka.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class KafkaRequest {

    private String topic;
    private String event;
}
