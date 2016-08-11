package com.util.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.util.service.Bank;

@Controller
public class Transfer {
	
	String balance;

	@RequestMapping(value = "/trans", method = RequestMethod.GET)
	public String trans(Model model,@ModelAttribute("SpringWeb")Custom g)
	{
		Bank b = new Bank();
		
		balance=b.transfer(g.getAcctNum(),g.getFromaccNum(),g.getAmount());
		
		
		
		return "TransferResult";
	}
}

