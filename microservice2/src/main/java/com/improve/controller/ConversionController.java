package com.improve.controller;

import com.improve.model.CurrencyConversion;
import com.improve.model.ExchangeValueDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConversionController {
    @Autowired
    private Environment environment;

    @GetMapping(path = "/currency-converter/from/{from}/to/{to}/quantity/{quantity}", produces = "application/json", consumes = "application/json")
    public CurrencyConversion convert(@PathVariable String from, @PathVariable String to, @PathVariable float quantity) {
        CurrencyConversion currencyConversion = new CurrencyConversion();
        currencyConversion.setFrom(from);
        currencyConversion.setTo(to);
        Map<String,String> uriParams = new HashMap<>();
        uriParams.put("from","usd");
        uriParams.put("to","ind");
        ResponseEntity<ExchangeValueDTO> responseEntity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", ExchangeValueDTO.class,uriParams);
        float conversionMultiple = responseEntity.getBody().getConversionMultiple();
        currencyConversion.setConversionMultiple(conversionMultiple);
        currencyConversion.setQuantity(quantity);
        currencyConversion.setTotalAmount(conversionMultiple*quantity);
        currencyConversion.setPort(Integer.parseInt(environment.getProperty("server.port")));
        return currencyConversion;
    }
}
