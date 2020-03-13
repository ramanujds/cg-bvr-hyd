package com.capg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capg.model.Employee;
import com.capg.service.EmployeeServiceImpl;

@WebServlet("/displayall")
public class EmployeeDisplayController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmployeeServiceImpl service;
	@Override
	public void init() throws ServletException {
		service=new EmployeeServiceImpl();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Employee> allEmployees=service.getAllEmployees();
		PrintWriter out=response.getWriter();
		allEmployees.forEach(out::println);
		
	}
	

}
