package com.ustglobal.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class TeacherDemo {
	
public static void main(String[] args) {
		
		
		ArrayList<Teacher>al = new ArrayList<Teacher>();
		
		Teacher s1 = new Teacher("hari",1,1200);
		Teacher s2 = new Teacher("ravi",2,1300);
		Teacher s3 = new Teacher("giri",3, 1400);
		Teacher s4 = new Teacher("jara",4, 1400);
		Teacher s5 = new Teacher("dora",5, 1400);
		Teacher s6 = new Teacher("mari",6, 1400);
		Teacher s7 = new Teacher("giri",7, 1400);
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
		for(Teacher s :al)
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
		
		  ListIterator<Teacher>it = al.listIterator();
		  while(it.hasPrevious())
		  {
			  System.out.println(it.previous());
		  }
		 
		  System.out.println();
		  System.out.println();
		  
		  
		  
		  System.out.println("===========================Linked List=====================================");
		  System.out.println();
		  
		  LinkedList<Teacher>l = new LinkedList<Teacher>();
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
		  for(Teacher s:l)
		  {
			  System.out.println(s);
		  }
		  
		  System.out.println();
		  System.out.println("==============By Using Iterator==========");
		  System.out.println();
		  Iterator<Teacher>it1 = l.iterator();
		  
		  while(it1.hasNext())
		  {
			  System.out.println(it1.next());
		  }
		  System.out.println();
		  System.out.println("========by Using List Iterator==========");
		  ListIterator<Teacher>l1 = l.listIterator();
		  while(l1.hasPrevious())
		  {
			  System.out.println(l1.previous());
		  }
		  
		  System.out.println("====================Stack===================================");
		  
		  Stack<Teacher>st = new Stack<Teacher>();
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
		  
		  for(Teacher s:st)
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
		  for(Teacher s:l)
		  {
			  System.out.println(s);
		  }
		  
		  System.out.println();
		  System.out.println("==============By Using Iterator==========");
		  System.out.println();
		  Iterator<Teacher>it2 = l.iterator();
		  
		  while(it2.hasNext())
		  {
			  System.out.println(it2.next());
		  }
		  System.out.println();
		  System.out.println("========by Using List Iterator==========");
		  ListIterator<Teacher>l2 = l.listIterator();
		  while(l2.hasPrevious())
		  {
			  System.out.println(l1.previous());
		  }
		  
	}

}
