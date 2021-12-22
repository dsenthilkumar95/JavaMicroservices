package com.improve.feignclient;

import com.improve.model.ExchangeValueDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "currency-exchange-service", url = "http://localhost:8000/")
public interface Microservice1FeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/currency-exchange/from/{from}/to/{to}")
    ExchangeValueDTO getExchangeValue(@PathVariable String from, @PathVariable String to);
}
