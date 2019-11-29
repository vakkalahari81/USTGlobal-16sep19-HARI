package com.ustgloabl.second;

public class TestA {
	
	public static void main(String[] args)  {
		
		try {
		   
		         for(int i=0;i<10;i++)
		         {
		          System.out.println("inside try block");
		          Thread.sleep(1000);
		            Thread.interrupted();
	             }
		      }
		catch(InterruptedException ie)
		{
			System.out.println("Exception caught");
		}
		System.out.println("main ended");
	}
}
