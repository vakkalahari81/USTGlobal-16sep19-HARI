package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("kukku",982323);
		hm.put("mala",6752731);
		hm.put("sheela",8758731);
		
		HashMap hm1 = new HashMap();
		hm1.put("Deepu",7868668);
		hm1.put("riya",6868668);
		hm1.put("kriti",8868668);
		
		boolean b;
		//System.out.println(b);
		
		if(b=hm1.containsKey("riya"))
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(b);
		}
		
		boolean b1 = hm.containsValue(786666);
		System.out.println(b1);
		
		hm.putAll(hm1);
		System.out.println("Copy form one map to Another map");
		System.out.println(hm);
		
		hm.clear();
		System.out.println(hm);
		
		System.out.println(hm.isEmpty());
	}

}
