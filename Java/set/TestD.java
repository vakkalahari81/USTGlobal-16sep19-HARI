package com.ustglobal.set;

import java.util.LinkedHashSet;

public class TestD {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Double> l = new LinkedHashSet<Double>();
		
		l.add(10.0);
		l.add(121.32);
		l.add(23.12);
		l.add(12.34);
		l.add(12.34);
		for(Double d:l)
		{
			System.out.println(d);
		}
		
	}

}
