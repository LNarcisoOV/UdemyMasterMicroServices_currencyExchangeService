package com.udemy.currencyexchangeservice.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

	@Id
	private Long id;
	private String fromCurrency;
	private String toCurrency;
	private BigDecimal conservionMultiple;
	private int port;

	public ExchangeValue() {
		super();
	}

	public ExchangeValue(Long id, String fromCurrency, String toCurrency, BigDecimal conservionMultiple) {
		super();
		this.id = id;
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.conservionMultiple = conservionMultiple;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
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
