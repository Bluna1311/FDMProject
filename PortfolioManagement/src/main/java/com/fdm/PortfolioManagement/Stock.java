package com.fdm.PortfolioManagement;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stocks")
public class Stock {

	@Id
	private String name;
	private double BuyValue;
	public String getName() {
		return name;
	}
	public Stock(String name, double buyValue, double sellValue, double volatility) {
		super();
		this.name = name;
		BuyValue = buyValue;
		this.sellValue = sellValue;
		Volatility = volatility;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBuyValue() {
		return BuyValue;
	}
	public void setBuyValue(double buyValue) {
		BuyValue = buyValue;
	}
	public double getSellValue() {
		return sellValue;
	}
	public void setSellValue(double sellValue) {
		this.sellValue = sellValue;
	}
	public double getVolatility() {
		return Volatility;
	}
	public void setVolatility(double volatility) {
		Volatility = volatility;
	}
	private double sellValue;
	private double Volatility;
	
	
	
	
	
}
