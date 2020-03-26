package com.capg.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShowController {

	@Value("${college-name}")
	String collegeName;
	
	@PostMapping("/show")
	public String show(@RequestParam("tName") String tName, 
								@RequestParam("tAge") int age, Model m) {
		m.addAttribute("tName",tName);
		m.addAttribute("age",age);
		m.addAttribute("college",collegeName);
		
		
		
		return "hello";
		}
}


