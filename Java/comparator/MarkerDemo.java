package com.ustglobal.comparator;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MarkerDemo {
	
	
	public static void main(String[] args) {
		
	Marker p1 = new Marker(12.23,"Abc","red");
	Marker p2 = new Marker(12.2,"Abc","yellow");
	Marker p3 = new Marker(12.03,"Abc","green");
	Marker p4 = new Marker(12.33,"Abc","blue");
	Marker p5 = new Marker(12.31,"Abc","pink");
	
	LinkedList<Marker> l = new LinkedList<Marker>();
	
	l.add(p1);
	l.add(p2);
	l.add(p3);
	l.add(p4);
	l.add(p5);
	
	System.out.println("===========================Before Sorting===========================");
	display(l);
	SortByprice sb = new SortByprice(); //comparator
	System.out.println("========================Sorting By using price=============================");
	Collections.sort(l,sb);
	display(l);
	
	System.out.println("========================Sort by using color==========================");
	SortByColor s = new SortByColor();
	Collections.sort(l,s);
	display(l);
	
	
}
public static void display(LinkedList<Marker> p)
{
	Iterator<Marker>itr = p.iterator();
	
	while(itr.hasNext())
	{
		Marker  p1 = itr.next();
		System.out.println("----------------------------------");
		System.out.println("price = "+p1.price);
		System.out.println("name = "+p1.name);
		System.out.println("color = "+p1.color);
		
	}
}

}
