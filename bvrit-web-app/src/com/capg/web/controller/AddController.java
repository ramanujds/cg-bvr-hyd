package com.capg.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capg.web.service.CalculatorService;

/**
 * Servlet implementation class AddController
 */
@WebServlet("/add")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int x,y,ans;
		x=Integer.parseInt(request.getParameter("tbNum1"));
		y=Integer.parseInt(request.getParameter("tbNum2"));
		String option=request.getParameter("operation");
		CalculatorService calService=new CalculatorService();
		float result=calService.calculate(x, y, option);
		PrintWriter out=response.getWriter();
		out.print("Result of "+option+" operation = "+result);
	}
	

}
