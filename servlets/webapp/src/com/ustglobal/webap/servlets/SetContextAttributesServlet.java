package com.ustglobal.webap.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetContextAttributesServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		ServletContext context = getServletContext();
		Object obj = new Object();
		context.setAttribute("obj",obj);
		
		PrintWriter out = res.getWriter();
		out.println("<h1>set contenr<h1>");
	}

}
