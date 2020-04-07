package com.capg.springboot.model;

public class User {

	private int userId;
	private String userName;
	private String email;
	private long phone;
	public User(int userId, String userName, String email, long phone) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.phone = phone;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	
}
