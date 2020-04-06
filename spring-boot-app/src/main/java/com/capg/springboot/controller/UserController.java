package com.capg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capg.springboot.model.User;
import com.capg.springboot.service.AgeCalculatorService;

@Controller
public class UserController {
	
	@Autowired
	AgeCalculatorService service;

	@GetMapping("/hello")
	public String sayHello(@RequestParam("tbName") String traineeName,
								Model m) {
		m.addAttribute("trainee",traineeName);
		return "view";
	}
	
	@PostMapping("/info")
	public String readUserInfo(@ModelAttribute User user, Model m) {
		int age=service.getAge(user.getDob());
		user.setAge(age);
		m.addAttribute("user",user);
		return "userinfo";
	}
	
	
	//@ModelAttribute
	
	@GetMapping("/")
	public String getDefaultPage() {
		return "index";
	}
}
