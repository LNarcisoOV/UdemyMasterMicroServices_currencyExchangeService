package com.udemy.currencyexchangeservice.model;

import java.math.BigDecimal;

public class ExchangeValue {

	private Long id;
	private String personalCurrency;
	private String newCurrency;
	private BigDecimal conservionMultiple;
	private int port;

	public ExchangeValue() {
		super();
	}

	public ExchangeValue(Long id, String personalCurrency, String newCurrency,
			BigDecimal conservionMultiple) {
		super();
		this.id = id;
		this.personalCurrency = personalCurrency;
		this.newCurrency = newCurrency;
		this.conservionMultiple = conservionMultiple;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPersonalCurrency() {
		return personalCurrency;
	}

	public void setPersonalCurrency(String personalCurrency) {
		this.personalCurrency = personalCurrency;
	}

	public String getNewCurrency() {
		return newCurrency;
	}

	public void setNewCurrency(String newCurrency) {
		this.newCurrency = newCurrency;
	}

	public BigDecimal getConservionMultiple() {
		return conservionMultiple;
	}

	public void setConservionMultiple(BigDecimal conservionMultiple) {
		this.conservionMultiple = conservionMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
