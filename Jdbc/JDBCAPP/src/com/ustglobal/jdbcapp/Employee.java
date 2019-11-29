package com.ustglobal.jdbcapp;

public class Employee {
	
	int id;
	String name;
	double sal;
	String gender;
	public Employee(int id, String name, double sal, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.gender = gender;
	}
	public String toString()
	{
		return id+","+","+name+","+","+sal+","+gender;
	}

}
