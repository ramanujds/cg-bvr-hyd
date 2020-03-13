package com.capg.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.capg.springmvc.model.Employee;
import com.capg.springmvc.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl service;
	
	@PostMapping("/add")
	public String addEmployee(@ModelAttribute Employee emp, Model m) {
		int id=service.addEmployee(emp);
		m.addAttribute("emp",id );
		return "success.jsp";
	}}
