package com.capg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capg.model.Employee;
import com.capg.service.EmployeeServiceImpl;

@WebServlet("/search")
public class EmployeeSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmployeeServiceImpl service;
	@Override
	public void init() throws ServletException {
		service=new EmployeeServiceImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int empId=Integer.parseInt(request.getParameter("tbEmpId"));
		Employee emp=service.findEmployee(empId);
		RequestDispatcher rd=request.getRequestDispatcher("viewemp.jsp");
		request.setAttribute("employee", emp);
		rd.forward(request, response);
		
	}
	

}
