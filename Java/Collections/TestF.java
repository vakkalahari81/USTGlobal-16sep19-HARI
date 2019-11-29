package com.ustglobal.collections;

import java.util.ArrayList;

public class TestF {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Hari");
		
		Object o = al.get(0);
		System.out.println(o);
	
		String name = (String)o;
		System.out.println(name.toUpperCase());
	}

}
