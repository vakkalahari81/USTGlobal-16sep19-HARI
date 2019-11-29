package com.ustglobal.exception;

public class TestA {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30};
		System.out.println(arr[0]);
		
		try {
		      System.out.println(arr[5]);
		       System.out.println(arr[2]);
		      // boolean b = 12;
		
	    }
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index is not present");
		}
		System.out.println("main ended");
	}
}
