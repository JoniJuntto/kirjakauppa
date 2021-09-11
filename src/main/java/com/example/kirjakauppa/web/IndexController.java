package com.example.kirjakauppa.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
	@RequestMapping("/index")
	public String home(
			@RequestParam("name") String name, 
			@RequestParam("age") Integer age, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "index";
	}
}
