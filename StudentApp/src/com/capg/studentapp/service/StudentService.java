package com.capg.studentapp.service;

import java.sql.SQLException;
import java.util.List;

import com.capg.studentapp.model.Student;

public interface StudentService {

	 public boolean addStudent(Student student) throws SQLException;
	 public boolean deleteStudentByRoll(int roll) throws SQLException;
	 public Student searchStudentByRoll(int roll) throws SQLException;
	 public List<Student> findAllStudents() throws SQLException;
	 public boolean updateStudent(Student student)throws SQLException;
}
