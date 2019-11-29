package com.ustglobal.objectClass;

public class Student {
	
	int id;
	String name;
	double percentage;
	public Student(int id, String name, double percentage) 
	{
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	/*public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(percentage);
	}*/
	public String toString()
	{
		return "name is="+name+"\n"+"id is= "+id+"\n"+"percentage is="+percentage; 
	}
	@Override
	public int hashCode()
	{
		return id;
	}
}
