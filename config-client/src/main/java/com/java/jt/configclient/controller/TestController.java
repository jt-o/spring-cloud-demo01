package com.java.jt.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jt on 2019/10/29 15:30
 */
@RestController
public class TestController {

    @Value("${test.config}")
    String config;

    @GetMapping(value = "/testConfig")
    public String testConfig() {
        return config;
    }
}
