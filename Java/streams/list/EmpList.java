package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpList {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee(1,"hari");
		Employee e2 = new Employee(2,"ravi");
		Employee e3 = new Employee(2,"dhoni");
		Employee e4 = new Employee(2,"yuvi");
		Employee e5 = new Employee(2,"mahi");
		
		Comparator<Employee> cmp = (s1,s2)->{
			return s1.name.compareTo(s2.name);
			
		};
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		List<Employee> l =al.stream().sorted(cmp).collect(Collectors.toList());
		
		for(Employee e: l)
		{
			System.out.print("name = "+e.name);
			System.out.println(" id = "+e.id);
		}
	}
}
