package com.ustglobal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DeleteQuery {
	
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			//step 1 Load the Driver
			  try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			 //step 2 getConnection
			  String url =  "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			  con = DriverManager.getConnection(url);
			  
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
