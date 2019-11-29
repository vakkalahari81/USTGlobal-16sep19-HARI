package com.ustglobal.objectClass;

public class CowDemo {
	
	public static void main(String[] args) {
		
		Cow c= new Cow(1,"naax",121);
		
		Cow c2 =new Cow(2,"ndfd",121);
		
		System.out.println(c.equals(c2));
		
		Cow c3 =c2;
		System.out.println(c3.equals(c2));
	}

}
