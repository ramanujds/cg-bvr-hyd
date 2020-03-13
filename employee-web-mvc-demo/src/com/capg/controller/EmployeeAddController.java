package com.capg.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capg.model.Employee;
import com.capg.service.EmployeeServiceImpl;

@WebServlet("/add")
public class EmployeeAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmployeeServiceImpl service;
	@Override
	public void init() throws ServletException {
		service=new EmployeeServiceImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int empId=Integer.parseInt(request.getParameter("tbEmpId"));
		String empName=request.getParameter("tbEmpName");
		int age=Integer.parseInt(request.getParameter("tbAge"));
		float salary=Float.parseFloat(request.getParameter("tbSalary"));
		Employee emp=new Employee(empId, empName, age, salary);
		int id=service.addEmployee(emp);
		response.getWriter().println("Employee with id ["+id+"] Created");
	}
	

}
