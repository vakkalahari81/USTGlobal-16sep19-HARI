package com.ustglobal.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class StudentDemo {
	
	public static void main(String[] args) {
		
		
		ArrayList<Student>al = new ArrayList<Student>();
		
		Student s1 = new Student("hari",1,1200);
		Student s2 = new Student("ravi",2,1300);
		Student s3 = new Student("giri",3, 1400);
		Student s4 = new Student("jara",4, 1400);
		Student s5 = new Student("dora",5, 1400);
		Student s6 = new Student("mari",6, 1400);
		Student s7 = new Student("giri",7, 1400);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		al.add(s7);
		
		System.out.println("============By using for loop===============");
		for(int i = 0 ;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("");
		System.out.println("=========By using While Loop===========");
		
		int j = 0;
		while(j<al.size())
		{
			System.out.println(al.get(j++));
		}
		j=0;
		System.out.println();
		System.out.println("========By Using For Each Loop============");
		for(Student s :al)
		{
			System.out.println(s);
		}
		System.out.println();
		System.out.println("=========By Using Iterator===========");
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		//System.out.println("==============By Using List Iterator=========");
		
		  ListIterator<Student>it = al.listIterator();
		  while(it.hasPrevious())
		  {
			  System.out.println(it.previous());
		  }
		 
		  System.out.println();
		  System.out.println();
		  
		  
		  
		  System.out.println("===========================Linked List=====================================");
		  System.out.println();
		  
		  LinkedList<Student>l = new LinkedList<Student>();
		  l.add(s1);
		  l.add(s2);
		  l.add(s3);
		  l.add(s4);
		  l.add(s5);
		  l.add(s6);
		  l.add(s7);
		  
		  System.out.println("==========By Using for Loop===========");
		  for(int i = 0 ;i<al.size();i++)
		  {
			  System.out.println(al.get(i));
		  }
		  System.out.println();
		  System.out.println("===========By using While Loop=======");
		  System.out.println();
		  while(j<al.size())
		  {
			  System.out.println(al.get(j++));
		  }
		  j=0;
		  System.out.println();
		  System.out.println("============By Using For Each Loop===========");
		  System.out.println();
		  for(Student s:l)
		  {
			  System.out.println(s);
		  }
		  
		  System.out.println();
		  System.out.println("==============By Using Iterator==========");
		  System.out.println();
		  Iterator<Student>it1 = l.iterator();
		  
		  while(it1.hasNext())
		  {
			  System.out.println(it1.next());
		  }
		  System.out.println();
		  System.out.println("========by Using List Iterator==========");
		  ListIterator<Student>l1 = l.listIterator();
		  while(l1.hasPrevious())
		  {
			  System.out.println(l1.previous());
		  }
		  
		  System.out.println("====================Stack===================================");
		  
		  Stack<Student>st = new Stack<Student>();
		  st.add(s1);
		  st.add(s2);
		  st.add(s3);
		  st.add(s4);
		  st.add(s5);
		  st.add(s6);
		  st.add(s7);

		  System.out.println();
		  System.out.println("============By using for loop===============");
		  for(int i = 0 ;i<st.size();i++)
		  {
		 		System.out.println(st.get(i));
		  }
		  
		  System.out.println();
		  System.out.println("=========By Using For each Loop==============");
		  
		  for(Student s:st)
		  {
			  System.out.println(s);
		  }
		  
		  System.out.println();
		  System.out.println("===========By Using While Loop============");
		  while(j<st.size())
		  {
			  System.out.println(st.get(j++));
		  }
		  
		  
		  j=0;
		  System.out.println();
		  System.out.println("============By Using For Each Loop===========");
		  System.out.println();
		  for(Student s:l)
		  {
			  System.out.println(s);
		  }
		  
		  System.out.println();
		  System.out.println("==============By Using Iterator==========");
		  System.out.println();
		  Iterator<Student>it2 = l.iterator();
		  
		  while(it2.hasNext())
		  {
			  System.out.println(it2.next());
		  }
		  System.out.println();
		  System.out.println("========by Using List Iterator==========");
		  ListIterator<Student>l2 = l.listIterator();
		  while(l2.hasPrevious())
		  {
			  System.out.println(l1.previous());
		  }
		  
	}
}
