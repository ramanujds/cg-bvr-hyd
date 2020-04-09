package com.capg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import com.capg.springboot.model.User;

@RestController
public class GitUserController {

	@Autowired
	RestTemplate rt;
	
	@GetMapping("/user/login/{login}")
	public ResponseEntity<User> getUserDetails(@PathVariable String login) {
		
		ResponseEntity<User> userEntity=rt.getForEntity("https://api.github.com/users/"+login,User.class);
		
		return userEntity;
		
	}
	
}
