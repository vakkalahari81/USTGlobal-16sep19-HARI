package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(60);
		al.add(30);
		al.add(10);
		
		List<Integer>l1 = al.stream().sorted().collect(Collectors.toList());
		Iterator<Integer>itr = l1.iterator();
		while(itr.hasNext())
		{
			Integer i  = itr.next();
			//System.out.println(itr.next());
			System.out.println(i);
		}
		
		
	}

}
