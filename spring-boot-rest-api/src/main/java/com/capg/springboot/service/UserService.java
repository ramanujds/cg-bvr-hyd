package com.capg.springboot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.model.User;
import com.capg.springboot.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo repo;
	
	public List<User> getListOfUsers(){
		return repo.getAllUsers();
	}
	
	public User getUser(int userId) {
		return repo.getUser(userId);
	}
	
	@Transactional
	public User addUser(User user) {
		return repo.addUser(user);
	}
	
	@Transactional
	public boolean deleteUser(int userId) {
		User user=getUser(userId);
		 return repo.deleteUser(user);
	}

	@Transactional
	public User updateUser(User newUserData) {
		return repo.updateUser(newUserData);
		
	}
	
	
}
