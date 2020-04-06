package com.capg.springboot.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

	private String userName;
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	private long phone;
	private int age;
	public User() {
		// TODO Auto-generated constructor stub
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public User(String userName, String email, LocalDate dob, long phone) {
		super();
		this.userName = userName;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
	}
	
	
	
	
}
