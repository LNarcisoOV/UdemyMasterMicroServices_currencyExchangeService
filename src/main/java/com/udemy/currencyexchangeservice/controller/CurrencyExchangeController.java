package com.udemy.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.currencyexchangeservice.model.ExchangeValue;

@RestController
@RequestMapping("/currencyExchange")
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;

	@GetMapping("/from/{personalCurrency}/to/{newCurrency}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String personalCurrency,
			@PathVariable String newCurrency) {
		ExchangeValue exchangeValue = new ExchangeValue(1000L, personalCurrency, newCurrency,
				new BigDecimal(4.20));
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeValue;
	}
}
