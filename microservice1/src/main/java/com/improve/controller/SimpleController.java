package com.improve.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class SimpleController {

    @Value("{limits-service.minimum}")
    private String min;

    @GetMapping(path="value", produces = "application/json", consumes = "application/json")
    public String getValueProperty() {
        return min;
    }
}
