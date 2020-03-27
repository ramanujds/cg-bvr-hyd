package com.capg.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.demo.model.User;
import com.capg.demo.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo repo;
	
	@Transactional
	public User saveUser(User user) {
		repo.saveUser(user);
		return getUserByEmail(user.getEmail());
	}
	
	public User getUserByEmail(String email) {
		return repo.getUserByEmail(email);
	}
	
	

}
