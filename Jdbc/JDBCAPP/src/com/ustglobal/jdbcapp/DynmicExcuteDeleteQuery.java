package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;


public class DynmicExcuteDeleteQuery {
	
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstm = null;
	   
		try {
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			
			con = DriverManager.getConnection(url);
			String sql = "delete from employee_info  where id = ? ";
			
			
			pstm = con.prepareStatement(sql);
			
			   String empid = args[0];
	      	   int id = Integer.parseInt(empid);
	      	   pstm.setInt(1,id);
	      	   
	      	   String name = args[1];
	      	   pstm.setString(2,name);;
	      	   
	      	   String sal = args[2];
	      	   int salary = Integer.parseInt(sal);
	      	   pstm.setInt(3,salary);
	      	   
	      	   
	      	   String gen = args[3];
	      	   pstm.setString(4,gen);
	      	   
	      	   pstm.setInt(4,id);
	      	   pstm.setString(1,name);
	      	   pstm.setInt(2,salary);
	      	   pstm.setString(3,gen);
	      	   
	      	   int count = pstm.executeUpdate();
	      	   
	      	   System.out.println(count+"row affected");
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
					if(pstm!=null)
					{
						con.close();
					}
			}
			
			catch(SQLException s)
			{
				s.printStackTrace();
			}
		}
	}
}
