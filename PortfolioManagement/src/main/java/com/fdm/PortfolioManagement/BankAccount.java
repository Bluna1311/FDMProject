package com.fdm.PortfolioManagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BankAccount")
public class BankAccount {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	public int getId() {
		return id;
	}
	public BankAccount() {
		super();
	}

	private double balance;
	private String currency;

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		currency = currency;
	}
	public BankAccount(double balance, String currency) {
		this.balance = balance;
		this.currency = currency;
	}
	
	
	
}
