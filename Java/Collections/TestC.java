package com.ustglobal.collections;

import java.util.ArrayList;

public class TestC {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		 
		al.add(120);
		al.add(false);
		al.add("hari");
		al.add(12.12);
		al.add(null);
		al.add('s');
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}

}
