package com.capg.demo.jpa;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "student_data")
@NamedQuery(name="getByName",
				query ="from Student s where s.sName=:sName" )
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roll;
	@Column(name = "student_name",length = 30, nullable = false, unique = true)
	private String sName;
	@Column(nullable = false)
	private int age;
	@ManyToMany(mappedBy = "student")
	private List<CaseStudy> cs;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(String sName, int age) {
		super();
		//this.roll = roll;
		this.sName = sName;
		this.age = age;
	}

	

	



	public List<CaseStudy> getCs() {
		return cs;
	}



	public void setCs(List<CaseStudy> cs) {
		this.cs = cs;
	}



	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Student [roll=" + roll + ", sName=" + sName + ", age=" + age + "]";
	}

	
	
}
