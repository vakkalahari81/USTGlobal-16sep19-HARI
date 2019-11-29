package com.ustglobal.exception;

public class TestC {
	
	public static void main(String[] args) {
		
		int [] arr = {12,12,4};
		int b=12;
		try {
			   try {
			       System.out.println(b/0);
		          } 
		       catch(ArithmeticException e )
		       {
			     System.out.println("denominator never be zero");
		      }
			   System.out.println(arr[12]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("index is not present");
		}
	}

}
