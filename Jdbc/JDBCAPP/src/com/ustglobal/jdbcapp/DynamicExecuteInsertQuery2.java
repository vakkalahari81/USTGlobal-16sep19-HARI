package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicExecuteInsertQuery2 {
	
	
	public static void main(String[] args)  {
		
		Connection con = null;
		//Statement stmt = null;
		PreparedStatement pstm = null;
	
		try {
			
			   //step 1 Load the D
	      	   Driver driver = new Driver();
	      	   DriverManager.registerDriver(driver);
	      	   
	      	   //step 2 get connection
	      	   
	      	   String url = "jdbc:mysql://localhost:3306/ust_ty_db?";
	      	   con = DriverManager.getConnection(url,"root","root");
	      	   
	      	   
	      	   
	      	   //step3 Issue Sql Query
	      	   
	      	   //static Query
	      	   /*String sql  = " insert into employee_info "+" values(8,'chandan',10000, 'M') ";
	      	   //stmt = con.createStatement();
	      	   
	      	   int count = stmt.executeUpdate(sql);
	      	   
	      	   //step  4 
	      	   System.out.println(count+"Row(s) inserted");*/
	      	   
	      	   String sql = "insert into employee_info values(?,?,?,?)";
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
	      	   
	      	   int count = pstm.executeUpdate();
	      	   System.out.println(count+"row affected");
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
					//if(stmt!=null)
						//stmt.close();
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
