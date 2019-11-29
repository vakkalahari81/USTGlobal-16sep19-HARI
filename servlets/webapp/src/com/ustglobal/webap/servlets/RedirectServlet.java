package com.ustglobal.webap.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String search = req.getParameter("search");
		
		String select = req.getParameter("select");
		
		if(select.equalsIgnoreCase("yahoo")) {
	    		         res.sendRedirect("https://in.yahoo.com/?p="+search);
		}
		
		else if(select.equalsIgnoreCase("google"))
		{
		   res.sendRedirect("https://www.google.com/search?q="+search);
	    }
		
		else if(select.equals("bing"))
		{
		   res.sendRedirect("https://www.bing.com/search?q="+search);
	    }
   }
}
