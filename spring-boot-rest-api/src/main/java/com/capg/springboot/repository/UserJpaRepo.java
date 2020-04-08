package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capg.springboot.model.User;

public interface UserJpaRepo extends JpaRepository<User, Integer>{

	public User getByEmail(String email);
	
	@Query(value = "from User where phone=:phone")
	public User getUserByPhone(long phone);
}
