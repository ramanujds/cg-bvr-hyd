package com.capg.studentapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.capg.studentapp.model.Student;

public class StudentRepoImpl implements StudentRepo {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	@Override
	public boolean saveStudent(Student student)throws SQLException {
		con=getDbConnection();
		ps=con.prepareStatement("insert into student values(?,?,?)");
		ps.setInt(1, student.getRoll());
		ps.setString(2, student.getsName());
		ps.setInt(3, student.getAge());
		int r=ps.executeUpdate();
		return r>0?true:false;
		
	}

	@Override
	public boolean deleteStudentByRoll(int roll) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student getStudentByRoll(int roll)throws SQLException {
		con=getDbConnection();
		ps=con.prepareStatement("select * from student where roll=?");
		ps.setInt(1, roll);
		rs=ps.executeQuery();
		Student s=null;
		if(rs.next()) {
			 s=new Student(rs.getInt(1),rs.getString(2),rs.getInt(3));
			
		}
		return s;
		
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Connection getDbConnection()throws SQLException {
		Connection con=DriverManager.
				getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","password");
		return con;
	}

}
