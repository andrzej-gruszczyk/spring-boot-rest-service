package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;
import java.util.UUID;

@Slf4j
@RestController
public class DemoController {

    private final SecureRandom random;

    public DemoController() {
        random = new SecureRandom("seed".getBytes());
    }

    @GetMapping("weather")
    public String getRandomWeather() {
        final var nextInt = random.nextInt(100);
        final var msg = String.format("The weather is %d%% sunny today", nextInt);
        log.info(msg);
        return msg;
    }

    @GetMapping("uuid")
    public String getRandomUuid() {
        var result = UUID.randomUUID().toString();
        log.info("Returning UUID {}", result);
        return result;
    }
}
