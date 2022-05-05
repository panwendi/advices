package com.pwd.advices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AdvicesApplication {
    private final Logger logger = LoggerFactory.getLogger(AdvicesApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AdvicesApplication.class, args);
    }

    @RequestMapping("/")
    public String home(@RequestParam(value = "name", defaultValue = "world!") String names) {
        logger.error("error logback");
        logger.info("info logback");
        return String.format("Hello %s!", names);
    }
}
