package com.ustglobal.objectClass;

public class TESTB {
	
	public static void main(String[]args)
	{
		Pen obj = new Pen();
		System.out.println(obj);
		System.out.println(new Pen());
		System.out.println(new Pen().toString());
		
		System.out.println("================");
		int h = obj.hashCode();
		System.out.println(h);
		
		System.out.println("================");
		int h2 = obj.hashCode();
		System.out.println(h2);
	}

}
