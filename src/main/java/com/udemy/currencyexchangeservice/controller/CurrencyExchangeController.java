package com.udemy.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.currencyexchangeservice.model.ExchangeValue;

@RestController
@RequestMapping("/currencyExchange")
public class CurrencyExchangeController {

	@GetMapping("/from/{personalCurrency}/to/{newCurrency}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String personalCurrency,
			@PathVariable String newCurrency) {
		return new ExchangeValue(1000L, personalCurrency, newCurrency, new BigDecimal(4.20));
	}
}
