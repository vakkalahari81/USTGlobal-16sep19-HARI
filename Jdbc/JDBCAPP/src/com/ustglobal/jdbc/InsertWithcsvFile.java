package com.ustglobal.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.PreparedStatement;

public class InsertWithcsvFile {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "insert into employee_info values(?,?,?,?)";
		try(FileReader in = new FileReader("csv.txt");
				BufferedReader reader = new BufferedReader(in);
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstm = (PreparedStatement) con.prepareStatement(sql)){
			
			while(reader.ready()) {
				
				String line = reader.readLine();
				String []data = line.split(",");
				int id = Integer.parseInt(data[0]);
				
				String name = data[1];
				int sal = Integer.parseInt(data[2]);
				String gen = data[3];
				
				pstm.setInt(1,id);
				pstm.setString(2,name);
				pstm.setInt(3,sal);
				pstm.setString(4,gen);
				
				//int count = pstm.executeUpdate();
				//System.out.println(count+"Rows(s) inserted");
				pstm.addBatch();
			}
			int []count = pstm.executeBatch();
			System.out.println(count.length + "rows are affected");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
