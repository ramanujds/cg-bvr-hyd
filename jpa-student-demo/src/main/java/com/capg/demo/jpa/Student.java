package com.capg.demo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_data")
public class Student {

	@Id
	private int roll;
	@Column(name = "student_name",length = 30, nullable = false)
	private String sName;
	@Column(nullable = false)
	private int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(int roll, String sName, int age) {
		super();
		this.roll = roll;
		this.sName = sName;
		this.age = age;
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
