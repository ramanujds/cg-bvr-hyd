package com.capg.demo;
import java.sql.*;
import java.util.Scanner;

public class JDBCDeleteDemo {

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
					("delete from bvrit_student where roll=?")	;		
			int roll;
			
			System.out.println("Enter roll you want to delete : ");
			roll=in.nextInt();
			
			//Set the parameters
			psmt.setInt(1, roll);
			
			//3. Execute Update
			
			int r=psmt.executeUpdate();
			
			if(r>0) {
				System.out.println("Deleted Successfully");
			}
			else {
				System.out.println("Deletion Failed..");
			}
	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
