package com.hahoho87.hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogTestController {

    @GetMapping("/log-test")
    public String logTest() {
        String name = "String";

        log.trace("log trace = {}", name);
        log.debug("log debug = {}", name);
        log.info("log info = {}", name);
        log.warn("log warn = {}", name);
        log.error("log error = {}", name);

        return "ok";
    }
}
