package com.jsp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class HelloCon 
{
	@RequestMapping("firstpage")
	public String hello()
	{
		return "hellopage";
	}
}
