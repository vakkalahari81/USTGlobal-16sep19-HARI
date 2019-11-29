package com.ustglobal.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestE {
	
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("heelo");
		al.add(12.34);
		al.add(true);
		
		ListIterator li = al.listIterator();
		System.out.println("---------->forward");
		while(li.hasNext())
		{
			Object o = li.next();
			System.out.println(o);
		}
		
		System.out.println("------------>BackWord");
		while(li.hasPrevious())
		{
			Object o = li.next();
			System.out.println(o);
		}
	}
}
