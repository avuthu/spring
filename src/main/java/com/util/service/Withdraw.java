package com.util.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.util.service.Bank;

@Controller
public class Withdraw {
	
	
String balance;
	
	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	@RequestMapping(value = "/with", method = RequestMethod.GET)
	public String with(Model model,@ModelAttribute("SpringWeb")Custom a)
	{
		Bank b = new Bank();
		
		balance=b.withdraw(a.getAcctNum(),a.getAmount());
		model.addAttribute("bal", balance);
		
		return "withdrawResult";
		
	}
}

