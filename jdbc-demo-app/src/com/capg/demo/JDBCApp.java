package com.capg.demo;
import java.sql.*;
import java.util.Scanner;

public class JDBCApp {

	public static void main(String[] args) {
		
		String url="jdbc:oracle:thin:@localhost:1521/xe"; //orcl
		String user="system"; //scott
		String password="password"; //tiger
		try {
			
			//1. Create Connection
			Connection con=DriverManager
						.getConnection(url,user,password);
			//System.out.println("Connection Successful");
			
			//2. Create Statement
			Statement smt=con.createStatement();
			
	
			//3. Execute Query
			ResultSet rs=smt.executeQuery
					("select * from bvrit_student order by roll");
			
			//4. Processing ResultSet
			System.out.printf("%-10s%-30s%-10s\n","Roll", "Name" , "Age");
			while(rs.next()) {
				
				System.out.printf("%-10d",rs.getInt("roll"));
				System.out.printf("%-30s" ,rs.getString(2));
				System.out.printf("%-10d",rs.getInt(3));
				System.out.println();
				}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
