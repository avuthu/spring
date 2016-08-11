package com.util.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.util.service.Bank;

@Controller
public class Deposit {
	String balance;
	
	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	@RequestMapping(value = "/dep", method = RequestMethod.GET)
	public String dep(Model model,@ModelAttribute("SpringWeb")Custom e)
	{
		Bank b = new Bank();
		balance=b.deposit(e.getAcctNum(),e.getAmount());
		model.addAttribute("bal", balance);
		return "depositResult";
	}
	
}
