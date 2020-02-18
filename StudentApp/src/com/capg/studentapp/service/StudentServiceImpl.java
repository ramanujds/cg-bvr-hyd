package com.capg.studentapp.service;

import java.sql.SQLException;
import java.util.List;

import com.capg.studentapp.dao.StudentRepo;
import com.capg.studentapp.dao.StudentRepoImpl;
import com.capg.studentapp.model.Student;

public class StudentServiceImpl implements StudentService{

	StudentRepo repo=new StudentRepoImpl();
	@Override
	public boolean addStudent(Student student) throws SQLException {
		return repo.saveStudent(student);
	}

	@Override
	public boolean deleteStudentByRoll(int roll) throws SQLException {
		return repo.deleteStudentByRoll(roll);
	}

	@Override
	public Student searchStudentByRoll(int roll) throws SQLException {
		return repo.getStudentByRoll(roll);
	}

	@Override
	public List<Student> findAllStudents() throws SQLException {
		return repo.getAllStudents();
	}

	@Override
	public boolean updateStudent(Student student) throws SQLException {
		return repo.updateStudent(student);
	}

}
