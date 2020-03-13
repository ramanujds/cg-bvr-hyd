package com.capg.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
		return "hello.jsp";
	}
	
	@PostMapping("/do")
	public void doSomething() {
		System.out.println("Done...");
	}
	
	
	
}
