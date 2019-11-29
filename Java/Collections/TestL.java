package com.ustglobal.collections;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<>();
		l.add(12);
		l.add(13);
		l.add(1);
		l.add(5);
		l.add(10);
		l.add(21);
		l.add(7);
		
		System.out.println("Before Sorting"+l);
		
		System.out.println("After Sorting");
		Collections.sort(l);
		System.out.println(l);
		
		Collections.reverse(l);
		System.out.println("Reverse"+l);
		
		
		Collections.shuffle(l);
		System.out.println("After Shuffle"+l);
	}
	

}
