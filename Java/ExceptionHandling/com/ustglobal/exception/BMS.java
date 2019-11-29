package com.ustglobal.exception;

public class BMS {
	
	public static void main(String[] args) {
		
		System.out.println("bms started");
		PVR p =new PVR();
		try {
		       p.book();
		       System.out.println("Booking is Confirmed");
	        }
		catch(ArithmeticException e)
		{
			System.out.println("Boking is Failed....try again");
		}
		System.out.println("bms ended");
      }
}
