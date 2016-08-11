package com.util.service;

public class Custom {
	int acctNum;
	double amount;
	String name;
	int toaccNum;
	int fromaccNum;
	String transaction;
	public String getTransaction() {
		return transaction;
	}
	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
	public int getAcctNum() {
		return acctNum;
	}
	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getToaccNum() {
		return toaccNum;
	}
	public void setToaccNum(int toaccNum) {
		this.toaccNum = toaccNum;
	}
	public int getFromaccNum() {
		return fromaccNum;
	}
	public void setFromaccNum(int fromaccNum) {
		this.fromaccNum = fromaccNum;
	}
}
