package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoController {

    @GetMapping("random-uuid")
    public String getRandomUuid() {
        var result = "aaa";
        log.info("Received REST request, returning {}", result);
        return result;
    }
}
