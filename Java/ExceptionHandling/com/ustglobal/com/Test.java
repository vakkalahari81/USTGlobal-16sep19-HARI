package com.ustglobal.com;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Main started");
		Paytm obj =new Paytm();
		try {
		         obj.book();
		         System.out.println("IRCTC booking successfully");
	       }
		catch(ArithmeticException e)
		{
			System.out.println("Booking failed");
		}
		finally {
			System.out.println("finally executed");
		}
		System.out.println("main ended");

}
}
