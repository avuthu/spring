package com.util.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.util.service.Bank;



/**
 * Handles requests for the application home page.
 */
@Controller
public class Login {
	
	private static final Logger logger = LoggerFactory.getLogger(Login.class);


	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String home(Locale locale, Model model,@ModelAttribute("SpringWeb")User e) throws ClassNotFoundException, SQLException {
		logger.info("Welcome home! The client locale is {}.", locale);
		Connection con = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		PreparedStatement ps = con
				.prepareStatement("select * from userdetails where name=?");
		ps.setString(1, e.getName());
		ResultSet rs = ps.executeQuery();
		User u = new User();
		if (rs.next()) {
			u.setPassword(rs.getString(2));
			u.setName(rs.getString(1));
		}

		if(e.getName().equals(u.getName()) && e.getPassword().equals(u.getPassword())){
			return "bank";
		}
		
		else{
		
		
		return "fail";
		
	}
		
	}
		
		
}

