package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class TestE {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>marks = new ArrayList<Integer>();
		marks.add(70);
		marks.add(10);
		marks.add(40);
		marks.add(60);
		marks.add(30);
		long l =marks.stream().filter(i->i<40).count();
		System.out.println(l);
		
		Comparator<Integer> cmp =(m1,m2)->{
			
			if(m1>m2) {
				return 1;
			}
			else  if(m1<m2)
			{
				return -1;
			}
			else {
				return 0;
			}
		};
		System.out.println("==========================");
		
		Integer i = marks.stream().min(cmp).get();
		System.out.println(i);
		
		System.out.println("===========================");
		
		Integer i1 = marks.stream().max(cmp).get();
		System.out.println(i1);
		
		System.out.println("=============================");
		
	}

}
