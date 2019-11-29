package com.ustglobal.jdbcapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.mysql.jdbc.Driver;
public class ExecuteUpdateQuery1 {
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		SortData s1 = new SortData();
		ArrayList<Employee>al = new ArrayList<Employee>();

		try {
		           Driver driver = new Driver();
		           DriverManager.registerDriver(driver);
		           
		           String url = "jdbc:mysql://localhost:3306/ust_ty_db?";
		           con =  DriverManager.getConnection(url,"root","root");
		          
		           
		           String sql = "update employee_info set name = 'vakkala' where id =1";
		           stmt = con.createStatement();
		           int count = stmt.executeUpdate(sql);
		           
		         
		           System.out.println(count+" row affected");		     
		            String s2 = " insert into employee_info "+" values (11,'harish',12000,'m')";
		            int c2 = stmt.executeUpdate(s2);
		            System.out.println(c2+"row affected");
		           
		            String s = "Select *from Employee_info";
		            rs = stmt.executeQuery(s);
		           
		          while(rs.next()) {
		        	   
		        	   int id = rs.getInt("ID");
		        	   String name = rs.getString("Name");
		        	   int sal = rs.getInt("salary");
		        	   String gen = rs.getString("gender");
		        	   System.out.println("-----------------------------");
		        	   
		        	   Employee e = new Employee(id,name,sal,gen);
		        	   al.add(e);
		        	   
		        	   System.out.println("Id = "+id);
		        	   System.out.println("Name = "+name);
		        	   System.out.println("Salary = "+sal);
		        	   System.out.println("Gender = "+gen);
		           }
		           
		          
		          
		           Collections.sort(al,s1);
		           System.out.println("---------------ArrayList--------------");
		           System.out.println("------------Sort By Name----------");
		           Iterator<Employee>itr = al.iterator();
		           while(itr.hasNext()) {
		        	   
		        	  Employee e1 = itr.next();
		        	  System.out.println("Name = "+e1.name);
		        	  System.out.println("Id = "+e1.id);
		        	  System.out.println("gender = "+e1.gender);
		        	  System.out.println("salary = "+e1.sal);
		        	  System.out.println("-----------------------------------");
		           }
		           
		           
		     }
		   catch(SQLException e) {
		        	e.printStackTrace();
		        }
		finally {
			
					try {
							if(con!=null) {
								con.close();
							}
							if(stmt!=null) {
								stmt.close();
							}
							if(rs!=null) {
								rs.close();
							}
					   }
					catch(SQLException e) {
						e.printStackTrace();
					}
		}       
	}

}
