package com.springcloud.member.controller.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClient {

    @Value("${config.name}")
    private String profile;

    @GetMapping( value = "/config/profile", produces = "application/json; charset=UTF8")
    public String configConnection() {
         return profile;
    }
}
