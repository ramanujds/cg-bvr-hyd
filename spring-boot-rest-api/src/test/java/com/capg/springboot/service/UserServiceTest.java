package com.capg.springboot.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.capg.springboot.model.User;
import com.capg.springboot.repository.UserJpaRepo;

class UserServiceTest {

	@Autowired
	UserJpaRepo repo;
	
	@BeforeEach
	void setUp() throws Exception {
		User user=new User(1001,"Dummy User","user@abc.com",4511399963L);
		repo.save(user);
		
	}

	@Test
	void testGetListOfUsers() {
		//fail("Not yet implemented");
	}

	@Test
	void testGetUser() {
		//fail("Not yet implemented");
	}

	@Test
	void testAddUser() {
		//User user=new User(1001,"Dummy User","user@abc.com",4511399963L);
		//repo.save(user);
		
	}

	@Test
	void testDeleteUser() {
		repo.deleteById(1001);
	}

	@Test
	void testUpdateUser() {
		//fail("Not yet implemented");
	}

	@Test
	void testGetUserByEmail() {
		//fail("Not yet implemented");
	}

}
