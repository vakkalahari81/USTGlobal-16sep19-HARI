package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {
		
		public static void main(String[] args) {
			
			ArrayList<Student>al = new ArrayList<Student>();
		
			Student s1 = new Student(12,"harish",76.77);
			Student s7 = new Student(32,"zahesh",76.00);
			Student s2 = new Student(1,"ravish",71.5);
			Student s3 = new Student(11,"girish",96.7);
			Student s4 = new Student(10,"nagesh",76.23);
			Student s5 = new Student(18,"suresh",76.42);
			Student s6 = new Student(32,"mahesh",76.00);
			al.add(s1);
			al.add(s2);
			al.add(s3);
			al.add(s4);
			al.add(s5);
			al.add(s6);
			al.add(s7);
			
			System.out.println("========================Befoer Sorting============================---------->");
			displayStudentDetails(al);
			Collections.sort(al);
			
			System.out.println("====================After sorting=================-------->");
			displayStudentDetails(al);
			
			
			
			
		}
		
		static void displayStudentDetails(ArrayList<Student> s)
		{
			Iterator<Student>it = s.iterator();
			
			while(it.hasNext())
			{
				Student s1 = it.next();
				System.out.println("==========================");
				System.out.println("Id is = " +s1.id);
				System.out.println("Name is = " +s1.name);
				System.out.println("Percentage  is = " +s1.per);
				
				
			}			
		}
}
