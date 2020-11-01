package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Student;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldController {
	@Autowired
	Student std;
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	@GetMapping("/student")
	public Student student() {
		return std;
	}
}
