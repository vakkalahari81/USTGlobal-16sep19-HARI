package com.ustglobal.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestD {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		 
		al.add(120);
		al.add(false);
		al.add("hari");
		al.add(12.12);
		
		Iterator itr = al.iterator();
		
		System.out.println("==========using iterator=============");
		
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			
			Object o = itr.next();
			System.out.println(o);
		}
		
		System.out.println("=========using for loop=======");
		
		for(;itr.hasNext();)
		{
			System.out.println(itr.next());
		}
	}
}
