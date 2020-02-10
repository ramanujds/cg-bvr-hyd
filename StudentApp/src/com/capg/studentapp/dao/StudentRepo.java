package com.capg.studentapp.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.capg.studentapp.model.Student;

public interface StudentRepo {
 
	public boolean saveStudent(Student student)throws SQLException;
	public boolean deleteStudentByRoll(int roll);
	public Student getStudentByRoll(int roll) throws SQLException;
	public List<Student> getAllStudents();
	public boolean updateStudent(Student student);
	public Connection getDbConnection() throws SQLException;
}
