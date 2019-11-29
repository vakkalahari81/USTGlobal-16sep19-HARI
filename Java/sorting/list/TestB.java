package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
	
	public static void main(String[] args) {
		
		LinkedList<Laptop>l = new LinkedList<>();
		
		Laptop l1 = new Laptop(10000,2,"sony");
		Laptop l2 = new Laptop(21000,4,"Dell");
		Laptop l3 = new Laptop(15000,3,"Acer");
		Laptop l4 = new Laptop(14000,2,"Lenovo");
		Laptop l5 = new Laptop(18901,4,"hp");
		Laptop l6 = new Laptop(17309,1,"Mac");
		
		l.add(l1);
		l.add(l2);
		l.add(l3);
		l.add(l4);
		l.add(l5);
		l.add(l6);
			
		System.out.println("===========Before Sorting==========");
		displayLaptopDetails(l);
		Collections.sort(l);
		
		System.out.println("========After Sorting===========");
		displayLaptopDetails(l);
	}
	
	public static void displayLaptopDetails(LinkedList<Laptop>link)
	{
		Iterator<Laptop>itr = link.iterator();
		
		while(itr.hasNext())
		{
			Laptop lp = itr.next();
			System.out.println();
			System.out.println("fee = "+lp.fee);
			System.out.println("Ram = "+lp.ram);
			System.out.println("Name =  "+lp.name);
		}
	}
}
