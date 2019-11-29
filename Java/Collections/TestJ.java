package com.ustglobal.collections;

import java.util.ArrayList;

public class TestJ {
	
	public static void main(String[] args) {
		
		ArrayList<Student>al= new ArrayList<Student>();
		
		Student s1 = new Student(100,"ankita",45.5);
		Student s2 = new Student(389,"salman",45.5);
		Student s3 = new Student(102,"salman",45.5);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(int i = 0;i<al.size();i++)
		{
			
			Student s = al.get(i);
			System.out.println(s);
			
			System.out.println("id is "+s.id);
			System.out.println("name is = "+s.name);
			System.out.println("percentage is = "+s.percentage);
		}
		for(Student s : al)
		{
			System.out.println(s);
		}
	}
}
