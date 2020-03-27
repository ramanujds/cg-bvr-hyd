package com.capg.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capg.demo.model.User;

@Controller
//@RequestMapping("/trainee-info")
public class ShowController {

	@Value("${college-name}")
	String collegeName;
	
	//@RequestMapping(value = "/show",method = RequestMethod.POST)
	@PostMapping("/show")
	public ModelAndView show(@ModelAttribute User user) {
		
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("user",user);
		return mv;
		}
	@GetMapping("/")
	public String showIndexPage(){
		return "index";
	}
	
}


