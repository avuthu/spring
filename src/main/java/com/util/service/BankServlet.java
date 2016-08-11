package com.util.service;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class BankServlet {
	

	@RequestMapping(value = "/toexecute", method = RequestMethod.GET)
	public String home(Locale locale, Model model,@ModelAttribute("SpringWeb")Custom l)
	{
		if(l.getTransaction().equals("deposit"))
		return "deposit";
		if(l.getTransaction().equals("withdraw"))
			return "withdraw";
		if(l.getTransaction().equals("transfer"))
			return "Transfer";
		if(l.getTransaction().equals("getCurrentBalance"))
			return "Getbalance";
		
		return "fail";
	}

}
