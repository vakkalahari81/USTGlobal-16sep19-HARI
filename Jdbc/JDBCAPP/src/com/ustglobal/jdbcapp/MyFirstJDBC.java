package com.ustglobal.jdbcapp;
import  java.sql.*;
import com.mysql.jdbc.Driver;

public class MyFirstJDBC {
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?";//+"user=root&password=root"; //optional
			con = DriverManager.getConnection(url,"root","root");
			
			
			
			stmt = con.createStatement();
			String sql = "select *from employee_info where id >1 And id<4";
			
			rs = stmt.executeQuery(sql);
			//System.out.println(rs);
			while(rs.next())
			{
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int  sal = rs.getInt("salary");
				String gender = rs.getString("gender");
			
				System.out.println("Id = "+id);
				System.out.println("Name= "+name);
				System.out.println("Salary = "+sal);
				System.out.println("Gender = "+gender);
				
//				System.out.println( rs.getInt("id"));
//				System.out.println(rs.getString("name"));
//				System.out.println(rs.getInt("salary"));
//				System.out.println(rs.getString("gender"));
				System.out.println("********************");
			}
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
				  if(stmt!=null)
				  {
					  stmt.close();
				  }
				  if(rs!=null)
				  {
					  rs.close();
				  }
			  }
			 catch(Exception e2)
			 {
				 e2.printStackTrace();
			 }
		}
	}
}
