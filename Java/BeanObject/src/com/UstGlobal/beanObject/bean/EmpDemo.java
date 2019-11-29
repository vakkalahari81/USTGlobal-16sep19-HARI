package com.UstGlobal.beanObject.bean;

public class EmpDemo {
	
	public static void main(String...args) {
		
		Employee e = new Employee();
		
		e.setName("Hari");
		e.setId(123);
		e.setSalary(12000);
		e.setDept("cse");
		e.setDesignation("Developer");
		e.setDoj(12062019);
		e.setDob(19061998);
		e.setAddress("Qspiders");
		e.setEmail("abc@gmail.com");
		
		//Bean Object
		EmployeeDataBase emp = new EmployeeDataBase();
		emp.received(e);
		
	}

}
