package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login.jsp")
public class LoginPageServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
		PrintWriter out = resp.getWriter();
		
		String id = "";
		Cookie[]cookies = req.getCookies();
		if(cookies!=null) {
		for(Cookie cookie: cookies) {
			
			if(cookie.getName().equals("alwyasRemember")) {	
				id = cookie.getValue();
			 }
		   }
		}
		out.println("<html>");
		out.println("<fieldset align = 'center'>");
		out.println("<legend>Login<legend>");
		out.println("<form action ='./login' method = 'post'>");
		out.println("<table align ='center' ");
		
		
   }

protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	doGet(req,resp);
	}
}	

	