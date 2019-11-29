package com.ustglobal.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestG {
	
	public static void main(String[] args) {
		
		ArrayList<String>al = new ArrayList <String>();
		al.add("anupama");
		al.add("savitha");
		al.add("kavitha");
		al.add("sunitha");
		
		
		String s= al.get(0).toUpperCase();
		System.out.println(s);
		
		Iterator<String>li = al.iterator();
		while(li.hasNext())
		{
			String s1 = li.next();
			System.out.println(s1);
		}
		
		
		System.out.println("=======Using list iterator========");
		
		ListIterator<String>l=al.listIterator();
		
		while(l.hasNext())
		{
			String s2 = l.next();
			System.out.println(s2);
		}
		System.out.println("=====using for Each=========");
		for(String s3:al)
		{
			System.out.println(s3);
		}
	}

}
