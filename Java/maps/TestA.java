package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("kukku",982323);
		hm.put("mala",6752731);
		hm.put("sheela",8758731);
		
		System.out.println("Data = "+hm);
		hm.put("mala",56956);
		System.out.println("After Modify"+hm);
		
		System.out.println("");
		hm.put("geeta",56956);
		System.out.println(hm);
		
		hm.put(null,1233);
		System.out.println("After Adding null value"+hm);
		
		System.out.println("After Adding one more value");
		hm.put(null,12121);
		System.out.println(hm);
		
		System.out.println("==============get Method===========");
		
		Object name = hm.get("sheela");
		System.out.println(name);
		
		System.out.println("==============remove method==========");
		Object value = hm.remove("kukku");
		
		System.out.println(value);
		
		System.out.println("===============After Removing=============");
		
		System.out.println("Data = "+hm);
		
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
	}

}
