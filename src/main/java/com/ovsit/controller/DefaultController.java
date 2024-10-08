package com.ovsit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
	@GetMapping("/")
	public ResponseEntity<String> getHealth() {
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}
}
