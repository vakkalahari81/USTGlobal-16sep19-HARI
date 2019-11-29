package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestC {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> lh = new LinkedHashMap<String,Integer>();
		lh.put("bangalore",560068);
		lh.put("haryana",134563);
		lh.put("delhi",114563);
		
		System.out.println(lh);
		System.out.println("==========Iterate keys==========");
		Set<String> s = lh.keySet();
		for(String s1:s)
		{
			System.out.println("key = "+s1);
		}
		
		//System.out.println("To get values");
		
		System.out.println("=============Iterate Values===========");
		Collection<Integer> c = lh.values();
		
		for(Integer o :c)
		{
			System.out.println("value= "+o);
		}
		
		System.out.println("===================Iterate Both keys and values");
		
		for(Map.Entry<String, Integer> m:lh.entrySet())
		{
			System.out.print("Key = "+m.getKey());
			System.out.println("--->Value = "+m.getValue());
		}
	}

}
