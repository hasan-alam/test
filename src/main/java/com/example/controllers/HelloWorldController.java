package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestControlle
@RequestMapping("/api/v1")
public class HelloWorldController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
}
