package com.util.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.util.service.Bank;

@Controller
public class GetBalance {
	
	double balance;
	
	@RequestMapping(value = "/bal", method = RequestMethod.GET)
	public String bal(Model model,@ModelAttribute("SpringWeb")Custom w)
	{
		Bank b = new Bank();
		
		balance=b.getBalance(w.getAcctNum());
		model.addAttribute("bal", balance);
		
		return "GetbalanceResult";
	}
}
