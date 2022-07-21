package com.coralogix.calculator.services;


import com.coralogix.calculator.model.ExchangeRate;
import com.coralogix.calculator.model.ExternalService;
import com.coralogix.calculator.repository.ExchangeRateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ExchangeRateService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    ExchangeRateRepository exchangeRateRepository;

    private final RestTemplate restTemplate;


    private String urlBaseExternalService = "http://localhost:8080/fixer/latest";

    //http://localhost:8080/fixer/latest?base=USD&symbols=PEN

    public ExchangeRateService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }


    public ExchangeRate getExchangeRate(String originCurrency, String finalCurrency){
        logger.info(" getExchangeRate {}");

        ExchangeRate exchangeRate = exchangeRateRepository.findExchangeRate(originCurrency, finalCurrency);

        if (exchangeRate == null){
            String urlExternalService = urlBaseExternalService + "?base=" + originCurrency + "&symbols=" + finalCurrency;

            ExternalService result = new ExternalService();

            try {
                result = restTemplate.getForObject(urlExternalService, ExternalService.class);

            } catch(HttpClientErrorException e) {
                logger.error("getExchangeRate() Error", e);

            }

            String value = result.getRates().get(finalCurrency);
            exchangeRate = new ExchangeRate(originCurrency, finalCurrency, result.getDate(), value);

            exchangeRateRepository.save(exchangeRate);

        }

        return exchangeRate;

    }

    public List<ExchangeRate> getAllExchangeRate(){
        return (List<ExchangeRate>) exchangeRateRepository.findAll();
    }




}
