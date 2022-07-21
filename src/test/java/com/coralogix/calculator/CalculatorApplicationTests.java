package com.coralogix.calculator;

import com.coralogix.calculator.model.ExchangeRate;
import com.coralogix.calculator.model.ExternalService;
import com.coralogix.calculator.services.ExchangeRateService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class CalculatorApplicationTests {

	private static String originalCurrency = "USD";

	private static String finalCurrency = "PEN";

	@Test
	void contextLoads() {
	}
	@Test
	public void getExchangeRate(String originalCurrency, String finalCurrency){

	}






}
