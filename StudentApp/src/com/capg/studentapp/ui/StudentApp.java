package com.capg.studentapp.ui;

import java.util.List;
import java.util.Scanner;

import com.capg.studentapp.model.Student;
import com.capg.studentapp.service.StudentService;
import com.capg.studentapp.service.StudentServiceImpl;

public class StudentApp {

	public static void main(String[] args) {
		
		
		
//		Scanner in=new Scanner(System.in);
//		
		StudentService service=new StudentServiceImpl();

		try {
			List<Student> sList=service.findAllStudents();
			for(Student s:sList) {
				System.out.println(s);
	
		}
		
		
		//		System.out.println("Enter roll ");
//		int roll=in.nextInt();
//		try {
//		Student s=service.searchStudentByRoll(roll);
//		if(s==null) {
//			System.out.println("No Data Found");
//		}
//		else {
//			System.out.println(s);
//		}
		
//		System.out.println("Enter roll ");
//		int roll=in.nextInt();
//		System.out.println("Enter name ");
//		String sName=in.next()+in.nextLine();
//		System.out.println("Enter Age ");
//		int age=in.nextInt();
//		
//		Student student1=new Student(roll, sName, age);
//		try {
//		if(service.addStudent(student1)) {
//			System.out.println("Student Saved\n"+student1);
//		}
//		else {
//			System.out.println("Failed..");
//		}
		}
		catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
		}

	}

}
