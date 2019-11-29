package com.ustglobal.collections;

import java.util.Iterator;
import java.util.Stack;

public class TestI {
	
	public static void main(String[] args) {
		
		Stack al = new Stack();
		
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
	}
}
