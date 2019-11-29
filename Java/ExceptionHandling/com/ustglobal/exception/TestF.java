package com.ustglobal.exception;

public class TestF {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		int a[]= {12,34,23};
		String s = null;
		try {
			
					 //s = s.toUpperCase();
					 //System.out.println(s);
						System.out.println(a[9]);
		   }
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println("exception occured");
		}
		System.out.println("main ended");
  }
}
