package com.ustglobal.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.emoapp.util.EmployeeManager;
import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;

public class App {

	
	public static void main(String[] args) {
		
		System.out.println("Press 1 to get All employee data");
		System.out.println("Press 2 to insert  employee data");
		System.out.println("Press 3 to update  employee data");
		System.out.println("Press 4 to delete  employee data");
		System.out.println("Press 5 to search  single employee data");
		
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch) {
		
		case 1:
			
	               EmployeeDAO impl =  EmployeeManager.getEmployeeDAO();
	               List<EmployeeBean> rs = impl.getAllEmployeData();
	               for(EmployeeBean bean:rs) {
	            	  System.out.println(bean.getName());
	            	  System.out.println(bean.getId());
	            	  System.out.println(bean.getGender());
	            	  System.out.println(bean.getSal());
	            	  System.out.println("-----------------------------");
	              }
	               break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			 EmployeeDAO impl5 =  EmployeeManager.getEmployeeDAO();
			 int id = sc.nextInt();
			EmployeeBean bean =  impl5.searchEmployeeData(id);
			if(bean!=null)
			{
				System.out.println("----------Searching Data is-------------");
				System.out.println(bean.getName());
          	    System.out.println(bean.getId());
          	    System.out.println(bean.getGender());
          	    System.out.println(bean.getSal());
				
			}
			else {
				    System.out.println("No Data Found");
			 }
			 break;
         }
    }
}