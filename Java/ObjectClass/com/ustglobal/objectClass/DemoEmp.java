package com.ustglobal.objectClass;

public class DemoEmp {
	
	public static void main(String...args)
	{
	
	Employee  e = new Employee(12,"abc",12000);

	Employee  e1 = new Employee(13,"abc",12000);
	

	Employee  e2 = e1;

	Employee  e3 = new Employee(12,"abc",12000);
	
	
	System.out.println(e.equals(e1));
	System.out.println(e.equals(e3));
	System.out.println(e2.equals(e1));
	
	}

}
