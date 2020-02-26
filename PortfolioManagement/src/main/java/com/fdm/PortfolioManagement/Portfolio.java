package com.fdm.PortfolioManagement;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Portfolios")
public class Portfolio {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	@OneToMany(cascade=CascadeType.PERSIST)
	private List<TransactionHistory> transactionHistory;

	public Portfolio(int id, List<com.fdm.PortfolioManagement.TransactionHistory> transactionHistory) {
		super();
		Id = id;
		this.transactionHistory = transactionHistory;
	}

	public Portfolio() {
	}

}
