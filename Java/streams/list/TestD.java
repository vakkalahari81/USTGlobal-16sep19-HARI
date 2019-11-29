package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestD {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(101);
		al.add(103);
		al.add(104);
		al.add(110);
		al.add(101);

		List<Integer> l = al.stream().map(i->i+54).collect(Collectors.toList());
		
		List<Integer> l1 = al.stream().map(i->i).collect(Collectors.toList());
		for(Integer i:l)
		System.out.println(i);
		
		System.out.println("====================");
		for(Integer i:l1)
		{
			System.out.println(i);
		}
		
		
	}
	
	

}
