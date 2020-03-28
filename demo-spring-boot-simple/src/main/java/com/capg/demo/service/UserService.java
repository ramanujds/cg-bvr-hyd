package com.capg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.demo.exceptions.UserNotFoundException;
import com.capg.demo.model.User;
import com.capg.demo.repository.UserJpaRepo;
import com.capg.demo.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo repo;
	@Autowired
	UserJpaRepo jpaRepo;
	
	@Transactional
	public User saveUser(User user) {
		repo.saveUser(user);
		return getUserByEmail(user.getEmail());
	}
	
	public User getUserByEmail(String email) {
		return jpaRepo.checkByEmail(email);
	}
	
	public List<User> getAllUser(){
		return jpaRepo.findAll();
	}
	
	public boolean deleteUser(String email) {
		User user=jpaRepo.checkByEmail(email);
		if(user==null) {
			throw new UserNotFoundException("No user found with email : "+email);
		}
		jpaRepo.delete(user);
		return !jpaRepo.existsById(user.getUserId());
	}

	public User updateUser(User newUserData) {
		// TODO Auto-generated method stub
		User oldUserData=jpaRepo.checkByEmail(newUserData.getEmail());
		if(oldUserData==null) {
			throw new UserNotFoundException("No user found with email : "+newUserData.getEmail());
		}
		
		oldUserData.setAge(newUserData.getAge());
		oldUserData.setDob(newUserData.getDob());
		oldUserData.setUserName(newUserData.getUserName());
		return jpaRepo.save(oldUserData);
	}

}
