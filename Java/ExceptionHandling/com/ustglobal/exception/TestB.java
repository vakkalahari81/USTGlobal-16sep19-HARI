package com.ustglobal.exception;

public class TestB {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		int a = 10;
		int b=1;
		try {
			   b = 10/2;
			   System.out.println(b);
			   System.out.println("Hello World");
		    }
	    catch(ArithmeticException e)
		{
			System.out.println("Number is devided by zero");
		}
		System.out.println(b);
		System.out.println("main ended");
	}
}
