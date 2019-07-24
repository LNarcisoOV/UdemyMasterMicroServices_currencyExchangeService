package com.udemy.currencyexchangeservice.excpetion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExchangeValueNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1366015896690886342L;

	public ExchangeValueNotFoundException(String message){
		super(message);
	}
}
