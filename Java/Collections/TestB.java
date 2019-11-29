package com.ustglobal.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class TestB {
	
			public static void main(String[] args) {
				
				ArrayList al = new ArrayList();
				
				al.add(120);
				al.add(false);
				al.add("hari");
				al.add(12.12);
				al.add(null);
				al.add('s');
			
				for(Object o :al)
				{
					System.out.println(o);
				}
			}

}
