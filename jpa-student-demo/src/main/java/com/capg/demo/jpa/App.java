package com.capg.demo.jpa;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

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
    	
    	
//    	Mobile m1=new Mobile("S10","Samsung");
//    	Mobile m2=new Mobile("Note 7","Redmi");
//    	Mobile m3=new Mobile("IPhone 11","Apple");
//    	
//    	tx.begin();
//    	
//    	em.persist(m1);
//    	em.persist(m2);
//    	em.persist(m3);
//    	tx.commit();
    	List<Mobile> mobiles;
    	
    	CriteriaBuilder cb=em.getCriteriaBuilder();
    	
    	CriteriaQuery<Mobile> cqMobiles=cb.createQuery(Mobile.class);
    	
    	Root<Mobile> mobRoot=cqMobiles.from(Mobile.class);
    	cqMobiles.where(cb.equal(mobRoot.get("brand"), "Samsung"));
    	
    	CriteriaQuery<Mobile> selectMobile=cqMobiles.select(mobRoot);
    	
    	Query q1=em.createQuery(selectMobile);
    	
    	 mobiles=q1.getResultList();
    	
    	mobiles.forEach(System.out::println);
    	
    	
    	
    	
//    	CaseStudy cs=new CaseStudy("Bank Management");
//    	Student s1=new Student("Abhishek",21);
//    	Student s2=new Student("Rebeca",21);
//    	Student s3=new Student("Prameela",21);
//    	
//    	s1.setCs(cs);
//    	s2.setCs(cs);
//    	s3.setCs(cs);
//    	
//    	cs.getStudent().addAll(Arrays.asList(s1,s2,s3));
//    	
//    	
//    	    	
//    	tx.begin();
//    	em.persist(cs);
//    	em.persist(s1);
//    	em.persist(s2);
//    	em.persist(s3);
//    	tx.commit();
//    	
//    	System.out.println("Inserted...");
//    	
//    	CaseStudy cs1=em.find(CaseStudy.class,1);
//    	
//    	cs1.printCaseStudy();
    	
    	
//    	Student s1=em.find(Student.class, 2);
//    	
//    	System.out.println(s1);
    	
    	
    	
    	
    	
    	
    	
    	
  //Querying Data
    //Named Queries
    	
//    	TypedQuery<Student> q=em.createNamedQuery("getByName",
//    												Student.class);
//    	q.setParameter("sName", "Tushar");
//    	Student s=q.getSingleResult();
//    	
//    	System.out.println(s);
//   	
    	
    	
    	

    	
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
