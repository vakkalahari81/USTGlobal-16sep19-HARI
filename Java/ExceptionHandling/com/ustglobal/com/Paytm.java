package com.ustglobal.com;

public class Paytm {
	
	public void book()
	{
		System.out.println("Paytm started");
		
		try {
		          IRCTC i = new IRCTC();
		          i.confirm(); 
		    }
		catch(ArithmeticException e)
		{
			throw e;
		}
		
		System.out.println("PayTm ended");
	}

}
