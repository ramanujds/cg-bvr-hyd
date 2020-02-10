package com.capg.demo;
import java.sql.*;
import java.util.Scanner;

public class JDBCUpdateDemo {

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
					("update bvrit_student set age=? where roll=?")	;		
			int roll;
			
			System.out.println("Enter roll you want to update : ");
			roll=in.nextInt();
			System.out.println("Enter new age : ");
			int age=in.nextInt();
			//Set the parameters
			psmt.setInt(2, roll);
			psmt.setInt(1, age);
			
			//3. Execute Update
			int r=psmt.executeUpdate();
			
			if(r>0) {
				System.out.println("Updated Successfully");
			}
			else {
				System.out.println("Updation Failed..");
			}
	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
