package com.ustglobal.sorting.list;

public class Student implements Comparable<Student>{
	
	int id;
	String name;
	double per;
	public Student(int id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	/*@Override
	public int compareTo(Student s)
	{
		//Sort By Id
		if(this.id>s.id)
		{
			return 1;
		}
		else if(this.id<s.id)
		{
			return -1;
		}
		else {
			return 0;
		}
	}*/
	
	/*@Override //Sort By Percentage
	public int compareTo(Student s)
	{
		if(this.per>s.per)
		{
			return 1;
		}
		else if(this.per<s.per)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}*/
	
	@Override //Comparing with Names
	public int compareTo(Student s)
	{
		if(this.name.toLowerCase().compareTo(s.name.toLowerCase())>0)
		{
			return  1;
		}
		else if(this.name.toLowerCase().compareTo(s.name.toLowerCase())<0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		/*
				String s = this.name;
				String s1 = s.name;s
				return s.compareTo(s1);
		*/ 
	  }
}
 