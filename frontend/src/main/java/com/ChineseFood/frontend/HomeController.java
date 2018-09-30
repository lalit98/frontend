package com.ChineseFood.frontend;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/Home")
	
		public String indexpage(HttpSession session)
		{		
		
		
		return "index";
	}
	

	@RequestMapping("/")
	public String  homepage()
	{
		return "index";
	}
			
	@RequestMapping("/Admin")
		
		public String Adminhome()
		{
		
			return "Admin";
		
		}
}
