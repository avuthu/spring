package com.util.service;

import java.util.Scanner;

public class Bank {
	public String deposit(int acctNum, double amt) {
		return "Deposit done new balance is " + updateAccount(acctNum, (getBalance(acctNum) + amt));
	}

	public String withdraw(int acctNum, double amt) {
		return "withdraw done new balance is " + updateAccount(acctNum, (getBalance(acctNum) - amt));
	}

	public String transfer(int toAcctNum, int fromAcctNum, double amt) {
		withdraw(fromAcctNum, amt);
		deposit(toAcctNum, amt);

		return " Deposit done";
	}

	public double getBalance(int acctNum) {
		FileFunctions f = new FileFunctions();

		Scanner scan = f.readFromFile("C:/Users/raj/Desktop/pro.txt");

		while (scan.hasNext()) {

			String line = scan.nextLine();

			String temp[] = line.split(" ");

			Customer c = new Customer(Integer.parseInt(temp[0]), temp[1], Double.parseDouble(temp[2]));

			if (c.acctNum == acctNum)

				return c.balance;

		} // while loop is done here

		return 0;
	}

	public double updateAccount(int acctNum, double newBalance) {
		FileFunctions f = new FileFunctions();

		Scanner scan = f.readFromFile("C:/Users/raj/Desktop/pro.txt");

		StringBuffer buffer = new StringBuffer();

		while (scan.hasNext()) {

			String line = scan.nextLine();

			String temp[] = line.split(" ");

			Customer c = new Customer(Integer.parseInt(temp[0]), temp[1], Double.parseDouble(temp[2]));

			if (c.acctNum == acctNum)
				c.balance = newBalance;

			buffer.append(c.acctNum + " " + c.name + " " + c.balance);
			buffer.append(System.lineSeparator());

		} // while loop is done here

		System.out.println(f.writeToFile("C:/Users/raj/Desktop/pro.txt", buffer.toString()));

		return getBalance(acctNum);
	}

}