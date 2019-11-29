package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		l.add(10);
		l.add(101);
		l.add(120);
		l.add(80);
		l.add(90);
		l.add(0);
		
		System.out.println("================peek()=====================");
		System.out.println(l.peekFirst());
		System.out.println("======================poll()==============================");
		Integer peek = l.poll();
		System.out.println(peek);
		
		System.out.println("==============peek First======");
		System.out.println(l.peekFirst());
		
		System.out.println("===========peek last==================");
		System.out.println(l.peekLast());
		
		System.out.println("============pollFirst==================");
		System.out.println(l.pollFirst());
		
		System.out.println("============poll Last==================");
		System.out.println(l.pollLast());
		System.out.println("========================");
		System.out.println(l);
		
		
	}	

}
