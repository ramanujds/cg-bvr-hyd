package com.capg.springboot.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capg.springboot.model.User;

@Repository
public class UserRepo {

	@PersistenceContext
	EntityManager em;
	
	public User addUser(User user) {
		em.persist(user);
		return user;
	}
	
	public  User getUser(int userId) {
		return em.find(User.class, userId);
	}
	
	public List<User> getAllUsers(){
		TypedQuery<User> queryGetAll=em.createQuery("from User",User.class);
		return queryGetAll.getResultList();
	}
	
	public boolean deleteUser(User user) {
		em.remove(user);
		return !em.contains(user);
	}
	public User updateUser(User user) {
		return em.merge(user);
	}
}
