package com.ustglobal.empapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;
import com.ustglobal.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	@Override
	public ArrayList<EmployeeBean>getAllEmployeData() 
	{
		
		String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select *from Employee_info";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);
			
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			ArrayList<EmployeeBean> result1 = new ArrayList<>();
			
			while(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				int id = rs.getInt("id");
				bean.setId(id);
				
				String name = rs.getString("name");
			    bean.setName(name);
			     
				int sal = rs.getInt("salary");
				bean.setSal(sal);
				
				String gen = rs.getString("gender");
				bean.setGender(gen);
				result1.add(bean);
			}
			return result1;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally 
		{
			try
			{
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
			catch(Exception e) {
				e.printStackTrace();
			}
				
	    }	
	}
	public void insertData() {
		
		String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "insert into Employee_info "+" Values(?,?,?,?) ";
		
		Connection con = null;
		PreparedStatement stmt = null;
	
	}
	@Override
	public EmployeeBean searchEmployeeData(int id) {
		
		String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root"; 
		String sql = "select * from Employee_info where id = ?";
		
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);
			
			pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setInt(1,id);
			rs = pstm.executeQuery();
			
			if(rs.next())
			{
				EmployeeBean bean = new EmployeeBean();
				bean.setId(rs.getInt("id"));
				
				bean.setName(rs.getString("Name"));
				bean.setSal(rs.getInt("id"));
				bean.setGender(rs.getString("gender"));
				
				return bean;
			}	
			 else
			 {
				     return null;
			 }
		  }
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			try
			{
			if(con!=null)
			
			{
				con.close();
			}
			if(pstm!=null) {
				pstm.close();
			}
			if(rs!=null) {
				rs.close();
			}
		  }
		catch(Exception e) {
				e.printStackTrace();
		}			
	}	
  }
}
