package com.ustglobal.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
	
	public static void main(String[] args) {
		
		ArrayList<String>l  = new ArrayList<String>();
		
		l.add("java");
		l.add("c");
		l.add("c++");
		l.add("python");
		l.add("JDBC".toLowerCase());
		
		System.out.println("Before Sort--->"+l);
		
		Collections.sort(l);
		
		System.out.println("After sort----->"+l);
		
	}

}
