package com.example.taskmanager;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LogController {
    private static final Logger log = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log")
    public String log() {
        log.trace("Log level: TRACE");
        log.debug("Log level: DEBUG");
        log.info("Log level: INFO");
        log.warn("Log level: WARN");
        log.error("Log level: ERROR");
        return "Check the logs";
    }
}