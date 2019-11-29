package com.ustglobal.set;

import java.util.LinkedHashSet;

public class TestC {

	public static void main(String[] args) {
		
		LinkedHashSet  l = new LinkedHashSet();
		
		l.add(10);
		l.add(true);
		l.add("java");
		l.add(10.3);
		l.add('c');
		l.add("%");
		
		for(Object  o : l)
		{
			System.out.println(o);
		}
		
		
	}
}
