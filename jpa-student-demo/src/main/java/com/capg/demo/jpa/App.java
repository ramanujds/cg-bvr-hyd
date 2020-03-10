package com.capg.demo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	EntityManagerFactory factory=Persistence.
    			createEntityManagerFactory("CapgStudent");
    	
    	EntityManager em=factory.createEntityManager();
    	EntityTransaction tx=em.getTransaction();
    	
  //Querying Data
    //Named Queries
    	
    	TypedQuery<Student> q=em.createNamedQuery("getByName",
    												Student.class);
    	q.setParameter("sName", "Tushar");
    	Student s=q.getSingleResult();
    	
    	System.out.println(s);
   	
    	
    	
    	

    	
    	//Typed Query
 
//    	TypedQuery<Student> query=
//    			em.createQuery("from Student where age>:searchAge",
//    											Student.class);
//    	
//    	query.setParameter("searchAge", 25);
//    	List<Student> allStudents=query.getResultList();
//    	
////    	allStudents.forEach(s->System.out.println(s));
//    	
//    	for(Student s:allStudents) {
//    			System.out.println(s);
//    	}
    	
    	
    	
    	
    	
//   Creating new Records    	
//    	Student s1=new Student("Tushar",24);
//
//    	tx.begin();
//    	em.persist(s1);
//    	tx.commit();
//    	System.out.println("Data Inserted");
    	
//  Reading Data
    	//Student s1=em.find(Student.class, 1002);
    	//System.out.println(s1);
    	
//  Delete Data
//    	tx.begin();
//    	em.remove(s1);
//    	tx.commit();
    	
    	
// Update Data
//    	tx.begin();
//    	s1.setAge(25);
//    	tx.commit();
//    	System.out.println("Updated");
    	
    	
    	
    }
}
