package com.ustglobal.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestH {
	
	public static void main(String[] args) {
		
		LinkedList al = new LinkedList();
		
		al.add(120);
		al.add(false);
		al.add("hari");
		al.add(12.12);
		al.add(null);
		al.add('s');
	
		System.out.println("========using for loop========");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("==========Using Iterator========");
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		/*for(;itr.hasNext();)
		{
			System.out.println(itr.next());
		}*/
		
		System.out.println("==========using list iterator============");
		
		ListIterator it = al.listIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
