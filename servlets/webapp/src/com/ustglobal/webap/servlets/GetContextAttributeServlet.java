package com.ustglobal.webap.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetContextAttributeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		ServletContext context = getServletContext();
		
		Object obj = context.getAttribute("obj");
		PrintWriter out= res.getWriter();
		out.println("<h1>");
		out.println(obj);
		out.println("</h1>");
	}
}
