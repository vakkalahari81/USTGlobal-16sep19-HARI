package com.ustglobal.collections;

import java.util.ArrayList;
import java.util.List;
public class TestK {
	
	public static void main(String[] args) {
		
		ArrayList<Double>al = new ArrayList<Double>();
		al.add(23.2);
		al.add(23.3);
		al.add(21.5);
		al.add(22.2);
		al.add(2.12);
		al.add(26.0);
		al.add(null);
		al.add(null);
		System.out.println(al);
		al.add(2,100.2);
		System.out.println("After Add 2nd Index\n"+al);
		
		al.remove(null);
		System.out.println("After removing\n"+al);
		
		Double val =al.get(4);
		System.out.println("Object at 4th Index\n"+val);
		
		//al.clear();
		//System.out.println("Clear method"+al);
		
		
		List<Double>al1  = new ArrayList<>();
		
		al1.add(1.2);
		al1.add(2.3);
		al1.add(23.4);
		al1.addAll(al);
		
		System.out.println("After Add All");
		System.out.println(al1);
		
		
		boolean con = al.contains(al1);
		System.out.println(con);
		
	}

}
