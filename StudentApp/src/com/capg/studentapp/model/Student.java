package com.capg.studentapp.model;

public class Student {
	private int roll;
	private String sName;
	private int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
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
	public Student(int roll, String sName, int age) {
		super();
		this.roll = roll;
		this.sName = sName;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", sName=" + sName + ", age=" + age + "]";
	}
	
	
}
