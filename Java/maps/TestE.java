package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	
	public static void main(String[] args) {
		
	              TreeMap<String,Integer> lh = new TreeMap<String,Integer>();
	               lh.put("bangalore",56);
	               lh.put("haryana",133);
	               lh.put("delhi",114563);
	              // lh.put(null,null);
	               
	               for(Map.Entry<String,Integer>m:lh.entrySet())
	               {
	            	   String key = m.getKey();
	            	   Integer value = m.getValue();
	            	   System.out.println("----------------------------------------");
	            	   System.out.print("key is "+key);
	            	   System.out.println(",Value is = "+value);
	               }
	
	}
}
