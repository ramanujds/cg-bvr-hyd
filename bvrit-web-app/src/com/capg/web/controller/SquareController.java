package com.capg.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SquareServlet
 */
@WebServlet("/square")
public class SquareController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		Cookie []cookies=request.getCookies();
		float result=0;
		for(Cookie ck:cookies) {
			if(ck.getName().equals("bvrit.web.app")) {
				result=Float.parseFloat(ck.getValue());
			}
		}
		
		HttpSession ssn=request.getSession();
//		float result=(float)ssn.getAttribute("result");
		
		//float result=Float.parseFloat(request.getParameter("result"));
		float square=result*result;
		ssn.setAttribute("square", square);
		response.sendRedirect("view.jsp");
		
		
	}

}
