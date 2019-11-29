package com.ustglobal.jdbcapp;

import java.sql.*;
import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
	
	
	public static void main(String[] args)  {
		
		Connection con = null;
		Statement stmt = null;
	
		try {
			
			   //step 1 Load the D
	      	   Driver driver = new Driver();
	      	   DriverManager.registerDriver(driver);
	      	   
	      	   //step 2 get connection
	      	   
	      	   String url = "jdbc:mysql://localhost:3306/ust_ty_db?";
	      	   con = DriverManager.getConnection(url,"root","root");
	      	   
	      	   //step3 Issue Sql Query
	      	   
	      	   String sql  = " insert into employee_info "+" values(8,'chandan',10000, 'M') ";
	      	   stmt = con.createStatement();
	      	   
	      	   int count = stmt.executeUpdate(sql);
	      	   
	      	   //step  4 
	      	   
	      	   System.out.println(count+"Row(s) inserted");
	      	   
		}
		catch(SQLException e)
		{
			
		}
		finally {
			
			try {
				
					if(con!=null)
					{
						con.close();
					}
					if(stmt!=null)
						stmt.close();
			}
			catch(SQLException s)
			{
				s.printStackTrace();
			}
		}
	}
}
