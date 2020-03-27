package com.capg.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capg.demo.model.User;

@Repository
public class UserRepo {

	@PersistenceContext
	EntityManager em;
	
	public void saveUser(User user) {
		em.persist(user);
		
	}
	
	public User getUserByEmail(String email) {
		TypedQuery<User> q=em.createQuery("from User where email=:email",User.class);
		q.setParameter("email", email);
		User user=q.getSingleResult();
		return user;
	}
	
	
	
}
