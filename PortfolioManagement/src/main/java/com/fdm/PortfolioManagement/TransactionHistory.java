package com.fdm.PortfolioManagement;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transaction_History")
public class TransactionHistory {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long TransactionId;
	public int getBuySellFlag() {
		return buySellFlag;
	}
	public TransactionHistory(int buySellFlag, double netCost) {
		super();
		this.buySellFlag = buySellFlag;
		NetCost = netCost;
	}
	private int buySellFlag; // sell =1 | buy = -1
	private double NetCost;
	private String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	public double getNetCost() {
		return NetCost;
	}
	public void setNetCost(double netCost) {
		NetCost = netCost;
	}
	public long getTransactionId() {
		return TransactionId;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	
	
}
