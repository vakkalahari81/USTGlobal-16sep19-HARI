package com.ustglobal.treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.TreeSet;

public class EmpDemo {
	
	public static void main(String[] args) {
		
		
		Comparator<Employee>comp = (e1,e2) ->{
			if(e1.height>e2.height)
			{
				return 1;
			}
			else if(e1.height<e2.height)
			{
				return -1;
			}
			else 
			{
				return 0;
			}
		};
		
		TreeSet<Employee>ts = new TreeSet<Employee>(comp);
		
		Employee e1 = new Employee(3,"sachin",5.4);
		Employee e2 = new Employee(2,"dhoni",5.7);
		Employee e3 = new Employee(1,"kohli",5.7);
		Employee e4 = new Employee(12,"rohit",5.6);
		Employee e5 = new Employee(3,"hari",5.5);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		System.out.println("===========Using Iterator===========");
		
		Iterator<Employee> it = ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println("=====================");
			Employee  e =  it.next();
			System.out.println("name = "+e.name);
			System.out.println("Id = "+e.name);
			System.out.println("height = "+e.height);
		}
		
	}
}
