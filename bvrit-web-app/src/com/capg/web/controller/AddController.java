package com.capg.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		//PrintWriter out=response.getWriter();
		//out.print("Result of "+option+" operation = "+result);
//		RequestDispatcher dispatcher=request.getRequestDispatcher("square");
//		request.setAttribute("result", result);
//		dispatcher.forward(request, response);
//		response.sendRedirect("square?result="+result);
		
//		HttpSession ssn=request.getSession();
//		ssn.setAttribute("result", result);
//		ssn.setMaxInactiveInterval(10);

		
		Cookie cookie=new Cookie("bvrit.web.app", String.valueOf(result));
		cookie.setMaxAge(60*60*24*365);
		response.addCookie(cookie);
		
		response.sendRedirect("square");
	}
	

}
