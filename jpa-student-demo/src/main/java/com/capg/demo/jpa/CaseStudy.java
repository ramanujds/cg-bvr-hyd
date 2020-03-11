package com.capg.demo.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class CaseStudy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	
	@ManyToMany
	private List<Student> student=new ArrayList<>();
	
	
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public CaseStudy(String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public CaseStudy() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CaseStudy [id=" + id + ", title=" + title + "]";
	}
	
	public void printCaseStudy() {
		System.out.println(this);
		//student.forEach(System.out::println);
	}
	
	
	

}
