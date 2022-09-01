package com.example.springbootkafka.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class EventController {

    @GetMapping("/publish")
    public ResponseEntity<String> publishEvent() {
        return ResponseEntity.ok("Hello!");
    }
}