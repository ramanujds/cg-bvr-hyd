package com.capg.demo;
import java.sql.*;
import java.util.Scanner;

public class JDBCInsertDemo {

	public static void main(String[] args) {
		
		String url="jdbc:oracle:thin:@localhost:1521/xe"; //orcl
		String user="system"; //scott
		String password="password"; //tiger
		try {
			Scanner in=new Scanner(System.in);
			
			//1. Create Connection
			Connection con=DriverManager
						.getConnection(url,user,password);
			//System.out.println("Connection Successful");
			
			//2. Create Statement
			PreparedStatement psmt=con.prepareStatement
					("insert into bvrit_student values(?,?,?)")	;		
			int roll;
			String sName;
			int age;
			System.out.println("Enter roll, name, age ");
			roll=in.nextInt();
			sName=in.next()+in.nextLine();
			age=in.nextInt();
			
			//Set the parameters
			psmt.setInt(1, roll);
			psmt.setString(2,sName);
			psmt.setInt(3, age);
			
			//3. Execute Update
			
			int r=psmt.executeUpdate();
			
			if(r>0) {
				System.out.println("Inserted Successfully");
			}
	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
