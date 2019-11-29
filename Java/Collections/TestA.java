package com.ustglobal.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class TestA {
	
			public static void main(String[] args) {
				
				ArrayList al = new ArrayList();
				
				al.add(120);
				al.add(false);
				al.add("hari");
				al.add(12.12);
				al.add(null);
				al.add('s');
				
				Object o = al.get(0);
				System.out.println(o);
				
				for(int i = 0;i<al.size();i++)
				{
					Object obj = al.get(i);
					System.out.println(obj);
					//System.out.println(al.get(i));
				}
			}

}
