package com.capg.demo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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
    	
//   Creating new Records    	
//    	Student s1=new Student(1002,"Priya",23);

//    	tx.begin();
//    	em.persist(s1);
//    	tx.commit();
//    	System.out.println("Data Inserted");
    	
//  Reading Data
    	Student s1=em.find(Student.class, 1002);
    	System.out.println(s1);
    	
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
