package com.ustglobal.exception;

public class TestE {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		int a[]= {12,34,23};
		String s = null;
		try {
			
					 s = s.toUpperCase();
					 System.out.println(s);
		   }
		catch(NullPointerException e)
		{
			System.out.println("Don't play with null value");
		}
		try {
					 System.out.println(a[10]/0);
		     }
		catch(ArrayIndexOutOfBoundsException e)
		{
			 System.out.println("index is not present");
		 }
		try {
			System.out.println(43/0);
		 }
		catch(ArithmeticException e)
		{
			System.out.println("Devided by Zero");
		}
	}
}
