package com.ustglobal.webap.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadCookieServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		Cookie []cookies = req.getCookies();
		
		PrintWriter  out = res.getWriter();
		
		if(cookies == null) {
			out.println("<h1>no Cookie Found</h1>");
		}
		else {
			for(Cookie cookie: cookies )
			{
				String name = cookie.getName();
			    if(name.equals("emp-name")) 
			    {
			    	cookie.setMaxAge(0);
			    		out.println("<h1>emp-name cookie value is");
			    		out.println(cookie.getValue());
			    		out.println("</h1>");
			    }
		     }
       }   
 }
}
