package com.telusko;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController 
{
	@RequestMapping("/welcome")
	public String someMessage(Model model)
	{
		model.addAttribute("name","Nargis");
		return "home";
	}
	@GetMapping("/skill")
	public String someMessage2(Model model)
	{
		model.addAttribute("name","Tamim");
		return "home";
	}
}
