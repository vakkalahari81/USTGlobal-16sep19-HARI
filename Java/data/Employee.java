package com.ustglobal.data;

public class Employee {
	

	String name;
	int id;
	double fee;
	public Employee(String name, int id, double fee) {
		super();
		this.name = name;
		this.id = id;
		this.fee = fee;
	}
	public String toString()
	{
		return "Name = "+name+" Id = "+id+" fee = "+fee;
		
	}

}
