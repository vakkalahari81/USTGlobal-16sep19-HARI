package com.ustglobal.jdbc;

import java.io.FileReader;
import java.sql.*;
import com.mysql.jdbc.Driver;
import java.util.Properties;

import com.mysql.jdbc.Statement;

public class MyFirstJDBC {
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		try {
			
			reader = new FileReader("db.properties");
			
			Properties pro = new Properties();
			pro.load(reader);
			
			//Class.forName("com.mysql.jdbc.Driver");
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step 2 get the connection
			String url =pro.getProperty("url");
	
			con = DriverManager.getConnection(url,pro);
			
			//step3
			stmt =  (Statement) con.createStatement();

			String sql = "select *from employee_info";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String name =rs.getString("name");
				int sal= rs.getInt("salary");
				String gen = rs.getString("gender");
				
				System.out.println("id = "+id);
				System.out.println("Name = "+name);
				System.out.println("salary = "+sal);
				System.out.println("Gender = "+gen);
			}
		}
		catch(Exception e) {
			
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
				 
				 if(rs!=null) {
					 rs.close();
				 }
				 if(reader!=null) {
					 reader.close();
				 }
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}	
	}
}
