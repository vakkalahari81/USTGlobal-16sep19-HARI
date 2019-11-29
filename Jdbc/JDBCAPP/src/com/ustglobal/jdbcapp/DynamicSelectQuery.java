package com.ustglobal.jdbcapp;

import java.sql.*;
import com.mysql.jdbc.Driver;
public class DynamicSelectQuery {
	
	public static void main(String[] args) {
		
		
		String url =  "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select *from employee_info where id = ?";
		
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			 Driver driver = new Driver();
			 DriverManager.registerDriver(driver);
			 
			 con = DriverManager.getConnection(url);
			 
			 pstm  = con.prepareStatement(sql);
			 
			 String empid = args[0];
			 int id = Integer.parseInt(empid);
			 pstm.setInt(1,id);
			 
			 rs = pstm.executeQuery();
			 
			 //step 4
			 
			 if(rs.next()) {
				 
				 int emp_id = rs.getInt("id");
				 int sal = rs.getInt("salary");
				 String name = rs.getString("name");
				 String gende = rs.getString("gender");
				 
				 System.out.println("employee_id = "+emp_id);
				 System.out.println("Salary  = "+sal);
				 System.out.println("Name = "+name);
				 System.out.println("gender = "+gende);
			 }
		  
		}
		catch(SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			
					try {
						 if(con!=null)
						 {
							 con.close();
						 }
						 if(pstm!=null)
						 {
							 pstm.close();
						 }
						 if(rs!=null) {
							 rs.close();
						 }
					}
					catch(SQLException e)
					{
						e.printStackTrace();
					}
		}
	}
}
