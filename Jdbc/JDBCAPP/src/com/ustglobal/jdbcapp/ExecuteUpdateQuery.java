package com.ustglobal.jdbcapp;

import java.sql.*;
import com.mysql.jdbc.Driver;
public class ExecuteUpdateQuery {
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			
				Driver driver = new Driver();
				DriverManager.registerDriver(driver);
				
				String url ="jdbc:mysql://localhost:3306/ust_ty_db?";
				con = DriverManager.getConnection(url,"root","root");
				
				
			 String sql  = " update employee_info set name = 'abc',salary = 50, gender = 'm' where id = 4 ";
			 stmt = con.createStatement();
			
			 int c = stmt.executeUpdate(sql);
			
			 System.out.println(c);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		finally {
			
			try {
		    	if(con!=null)
			    {
				 con.close();
			   }
			   if(stmt!= null)
			   {
				 stmt.close();
			  }
		  }
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}
  }
}