package com.capg.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.model.User;
import com.capg.demo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRestController {
	@Autowired
	UserService service;
	
	
	@GetMapping("/user/{email}")
	public User getUserResourceByEmail(@PathVariable("email") String email) {
		User user=service.getUserByEmail(email);
		return user;
		}
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	
	@DeleteMapping("/user/{email}")
	public Boolean deleteUser(@PathVariable String email) {
		return service.deleteUser(email);
	}
	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}
}
