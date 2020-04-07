package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.model.User;
import com.capg.springboot.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRestController {
	@Autowired
	UserService service;

	//@RequestMapping(value = "/message", method = RequestMethod.GET)
	@GetMapping("/message")
	public String getMessage() {
		return "Hello World";
	}
	
	@GetMapping("/users")
	public List<User> getAllUser(){
		return service.getUsers();
	}
	
	@GetMapping("/users/id/{id}")
	public User getUserById(@PathVariable("id") int userId) {
		return service.getUser(userId);
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user){
		return service.addUser(user);
	}
	
	
}
