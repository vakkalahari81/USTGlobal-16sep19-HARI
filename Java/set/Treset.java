package com.ustglobal.set;

import java.util.TreeSet;

public class Treset {
	
	public static void main(String[] args) {
		
		TreeSet<Integer>t = new TreeSet<Integer>();
		t.add(10);
		t.add(0);
		t.add(23);
		t.add(10);
		t.add(10);
		t.add(100);
		//t.add(null);
		//t.add(null);
		
		for(Object  o : t)
		{
			System.out.println(o);
		}
		
		
	}

}
