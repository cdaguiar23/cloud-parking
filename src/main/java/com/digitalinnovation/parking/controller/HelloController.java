package com.digitalinnovation.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Olá Claudionei...Este é Curso de Spring da Digital Innovation One";
	}
}
