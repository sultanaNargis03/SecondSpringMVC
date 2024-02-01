package com.telusko;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController 
{
	@PostMapping("/skill")
	public String someMessage(Model model)
	{
		model.addAttribute("message","Focus is the key");
		return "focus";
	}
	
	@GetMapping("/telusko")
	public void someImportantMessage(Map<String,Object> map)
	{
		map.put("name","Tamim");
		return ;
	}
}
