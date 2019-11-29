package com.ustglobal.maps;

import java.util.Hashtable;

public class TestG {

	public static void main(String[] args) {
		
	Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
	ht.put(101,"vijay");
	ht.put(102,"ajay");
	ht.put(103,"sonu");
	ht.put(104,"monu");
	//ht.put(null,"john");
	ht.put(121,"error");
	
	System.out.println("data = "+ht);
	}
}
