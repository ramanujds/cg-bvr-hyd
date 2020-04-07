package com.capg.springboot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.capg.springboot.model.User;

@Service
public class UserService {

	Map<Integer, User> users=new HashMap<>();
	
	@PostConstruct
	public void addSomeUsers() {
		User user1=new User(101, "Rahul", "rahul@gmail.com", 78554841303L);
		User user2=new User(102, "Gourav", "gaurav@gmail.com", 4578512503L);
		User user3=new User(103, "Harsh", "harsh@gmail.com", 4584541303L);
		
		users.put(user1.getUserId(),user1 );
		users.put(user2.getUserId(), user2);
		users.put(user3.getUserId(), user3);
	}
	
	public List<User> getUsers(){
		List<User> allUser=new ArrayList<User>();
		users.forEach((k,v)->allUser.add(v));
		return allUser;
	}
	
	public User getUser(int userId) {
		return users.get(userId);
	}
	
	public User addUser(User user) {
		users.put(user.getUserId(),user);
		return user;
	}
	
	public boolean deleteUser(int userId) {
		 users.remove(userId);
		 return !users.containsKey(userId);
	}
	
	
}
