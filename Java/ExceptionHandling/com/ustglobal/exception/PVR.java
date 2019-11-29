package com.ustglobal.exception;

public class PVR {

	public void book()
	{
		System.out.println("booking is started");
		try {
			 System.out.println(10/0);
			 System.out.println("logic for booking");
			 System.out.println("booking confirmed");
		    }
		catch(ArithmeticException e)
		{
			System.out.println("bookin is failed");
			throw e;
		}
	}
}
