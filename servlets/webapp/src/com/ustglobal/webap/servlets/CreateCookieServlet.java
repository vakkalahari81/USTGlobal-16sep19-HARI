package com.ustglobal.webap.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateCookieServlet extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		Cookie cookie = new Cookie("emp-name","hari");
		cookie.setMaxAge(1000);
		res.addCookie(cookie);
		PrintWriter out = res.getWriter();
		out.println("<h1>Cookie created</h1>");	
		
	
	}
}
