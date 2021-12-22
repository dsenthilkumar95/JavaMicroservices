package com.improve.controller;

import com.improve.model.ExchangeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class ExchangeController {
    @Autowired
    private Environment environment;

    @GetMapping(path = "/currency-exchange/from/{from}/to/{to}", produces = "application/json")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
        ExchangeValue exchangeValue = new ExchangeValue();
        exchangeValue.setFrom(from);
        exchangeValue.setTo(to);
        exchangeValue.setConversionMultiple(72);
        exchangeValue.setId(1);
        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return exchangeValue;
    }
}
