package com.ustglobal.set;

import java.util.HashSet;

public class TestB {
	
	public static void main(String[] args) {
		
		HashSet<String>hs = new HashSet<String>();
		hs.add("abcd");
		hs.add("def");
		hs.add("java");
		hs.add("c");
		hs.add("Sql");
		hs.add("c");
		hs.add("c");
		//System.out.println(hs);
		
		for(String s:hs)
		{
			System.out.println(s);
		}
		
	}

}
