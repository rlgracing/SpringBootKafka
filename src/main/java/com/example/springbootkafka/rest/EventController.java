package com.example.springbootkafka.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/event")
public class EventController {

    @GetMapping("/publish")
    public ResponseEntity<String> publishEvent() {
        log.info("it worked!");
        return ResponseEntity.ok("Hello!");
    }
}
