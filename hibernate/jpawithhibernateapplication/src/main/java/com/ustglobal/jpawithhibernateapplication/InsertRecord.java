package com.ustglobal.jpawithhibernateapplication;

import com.ustglobal.jpawithhibernateapp.dto.EmployeeInfo;

public class InsertRecord {

	public static void main(String[] args) {
		
		EmployeeInfo info = new EmployeeInfo();
		info.setId(29);
		info.setName("rahul");
		info.setSalary(50000);
		info.setGender("m");
	}
}
