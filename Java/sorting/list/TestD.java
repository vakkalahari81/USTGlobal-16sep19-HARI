package com.ustglobal.sorting.list;

import java.util.Stack;

public class TestD {
	
	public static void main(String...args)
	{
	 Stack<Integer> s = new Stack<Integer>();
	
    	s.add(10);
     	s.push(10);
     	s.push(100);
     	s.push(200);
     	
     	System.out.println("========using get()========");
     	for(int i = 0 ; i<s.size();i++)
     	{
     		System.out.println(s.get(i));
     	}
     	System.out.println("=============using pop()============");
     	for(int i = 0 ;i<s.size();i++)
     	{
     		System.out.println(s.pop());
     	}
 }
}
