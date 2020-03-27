package com.capg.demo.model;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

	@Size(min = 3, max = 30)
	private String userName;
	@Email
	private String email;
	@Size(max = 80, min = 15)
	private int age;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String email, int age, LocalDate dob) {
		super();
		this.userName = userName;
		this.email = email;
		this.age = age;
		this.dob = dob;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Uesr [userName=" + userName + ", email=" + email + ", age=" + age + ", dob=" + dob + "]";
	}
	
	
}
