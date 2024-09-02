package com.ovsit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	@GetMapping("/home")
	public String sayHello() {
		return "Hello from Spring Boot Sample API";
	}
}
