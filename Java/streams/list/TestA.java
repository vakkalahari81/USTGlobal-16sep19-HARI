package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(101);
		al.add(103);
		al.add(104);
		al.add(102);
		al.add(110);
		al.add(101);

		List<Integer> l = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		for(Integer i:l)
		System.out.println(i);
		
		
	}
	
	

}
