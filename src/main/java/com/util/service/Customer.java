package com.util.service;

public class Customer {
	
	int acctNum;
	String name;
	double balance;
	public Customer(int acctNum, String name, double amt) {
		super();
		this.acctNum = acctNum;
		this.name = name;
		this.balance = amt;
		
	}
	@Override
	public String toString() {
		return "Customer [acctNum=" + acctNum + ", name=" + name + ", balance=" + balance + "]";
	}

}
