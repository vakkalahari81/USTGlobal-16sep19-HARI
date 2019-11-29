package com.ustglobal.immutable;

import java.util.Iterator;
import java.util.TreeSet;

public class EmpDemo {

	public static void main(String[] args) {

	TreeSet<Employee> hs  = new TreeSet<Employee>();

	Employee e1 = new Employee(12,"sweety",23000);
	Employee e2 = new Employee(1,"sheela",23000);
	Employee e3 = new Employee(11,"anushka",23000);
	Employee e4 = new Employee(120,"tamanna",23000);
	Employee e5 = new Employee(19,"samantha",23000);
	Employee e6 = new Employee(120,"tamanna",23000);
	
	    hs.add(e1);
	    hs.add(e2);
	    hs.add(e3);
	    hs.add(e4);
	    hs.add(e5);
	    hs.add(e6);
	    System.out.println("==============Using Iterator===========");
	    Iterator<Employee> itr = hs.iterator();
	    
	    while(itr.hasNext())
	    {
	    	Employee e = itr.next();
	    	System.out.println("=================================");
	    	System.out.println("Id = "+e.id);
	    	System.out.println("Name = "+e.name);
	    	System.out.println("slary = "+e.salary);
	    }
	}
}
