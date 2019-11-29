package com.UstGlobal.beanObject.bean;

public class EmployeeDataBase {
	
			void received(Employee e)
			{
				System.out.println("name = "+e.getName());
				System.out.println("id = "+e.getId());
				System.out.println("salary= "+e.getSalary());
				System.out.println("Department = "+e.getDept());
				System.out.println("Designation = "+e.getDesignation());
				System.out.println("Date of Joining = "+e.getDoj());
				System.out.println("Date of Birth="+e.getDob());
				System.out.println("Address  ="+e.getAddress());
				System.out.println("email = "+e.getEmail());
			}
}
