package com.ovsit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

	@GetMapping("/home")
	public String index(Model model) {
		model.addAttribute("message", "Hello from AWS EC2");
		return "Index";
	}
	
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("message", "This has been deployed to AWS ECS");
		return "Index";
	}
}
