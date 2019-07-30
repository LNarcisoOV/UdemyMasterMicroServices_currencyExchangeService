package com.udemy.currencyexchangeservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.currencyexchangeservice.excpetion.ExchangeValueNotFoundException;
import com.udemy.currencyexchangeservice.model.ExchangeValue;
import com.udemy.currencyexchangeservice.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Environment environment;

	@Autowired
	private ExchangeValueRepository exchangeValueRepository;

	@GetMapping("/from/{fromCurrency}/to/{toCurrency}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String fromCurrency,
			@PathVariable String toCurrency) {

		ExchangeValue exchangeValue = exchangeValueRepository.findByFromCurrencyAndToCurrency(fromCurrency,
				toCurrency);

		if (exchangeValue == null) {
			throw new ExchangeValueNotFoundException("Exchange value not found");
		}

		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		
		logger.info("{}", exchangeValue);
		
		return exchangeValue;
	}
}
