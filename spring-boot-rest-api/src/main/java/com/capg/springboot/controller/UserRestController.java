package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public ResponseEntity<List<User>> getAllUser(){
		List<User> allUsers=service.getListOfUsers();
		if(allUsers.isEmpty()){
			return new ResponseEntity<List<User>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<User>>(allUsers,HttpStatus.OK);
	}
	
	@GetMapping("/users/id/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") int userId) {
		
		User user= service.getUser(userId);
		if(user==null) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> addUser(@RequestBody User user){
		service.addUser(user);
		if(service.getUser(user.getUserId())==null) {
			return new ResponseEntity<User>(HttpStatus.NOT_MODIFIED);
		}
		return new ResponseEntity<User>(user,HttpStatus.CREATED);
	}
	
	@PutMapping("/users")
	public ResponseEntity<User> updateUser(@RequestBody User user){
		
		if(service.getUser(user.getUserId())==null) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		User newUserData=service.updateUser(user);
		
		return new ResponseEntity<User>(user,HttpStatus.OK);
		
	}
	
	//Task - Add @DeleteMapping
	
	@DeleteMapping("/users/id/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable("id") int userId) {
		if(service.deleteUser(userId)) {
			return new ResponseEntity<User>(HttpStatus.OK);
		}
		return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/users/email/{email}")
	public User getUserByEmail(@PathVariable String email) {
		return service.getUserByEmail(email);
	}
}
