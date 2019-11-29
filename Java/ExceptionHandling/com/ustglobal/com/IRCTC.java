package com.ustglobal.com;

public class IRCTC {
	
	public void confirm()
	{
		try {
		       System.out.println("IRCTC started");
		       System.out.println(10/0);
		       System.out.println("IRCTC ended");
	       }
		catch(ArithmeticException e)
		{
			throw e;
		}

  }
}