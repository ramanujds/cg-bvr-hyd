package com.capg.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capg.demo.model.User;

public interface UserJpaRepo extends JpaRepository<User, Integer> {

	@Query("from User where email=:email")
	public User checkByEmail(String email);
}
