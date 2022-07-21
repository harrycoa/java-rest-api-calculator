package com.coralogix.calculator.controller;


import com.coralogix.calculator.model.ExchangeRate;
import com.coralogix.calculator.services.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rate")
public class ExchangeRateController {


    @Autowired
    private ExchangeRateService exchangeRateService;


    @GetMapping("/getAllExchangeRate")
    public List<ExchangeRate> getAllExchangeRate(){
        return exchangeRateService.getAllExchangeRate();
    }

    @GetMapping("/getExchangeRate")
    public  ExchangeRate getExchangeRate(@RequestParam(name = "originCurrency") String originCurrency, @RequestParam(name = "finalCurrency") String finalCurrency){
        return exchangeRateService.getExchangeRate(originCurrency,finalCurrency);
    }

}
