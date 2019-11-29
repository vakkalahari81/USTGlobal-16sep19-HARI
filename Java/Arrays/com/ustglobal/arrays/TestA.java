package com.ustglobal.arrays;

public class TestA {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		System.out.println(arr.length);
		//System.out.println(arr[11]);
		
		arr[0] =10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		System.out.println("For Each");
		for(int i:arr)
			System.out.println(i);
		
		System.out.println("For Each");
		int arr1[] = {10,30,12,34,12};
		for(int i:arr1)
			System.out.println(i);
		
		System.out.println("==========character Array===========");
		char c[] = {'a','b','c','d'};
		for(char a:c)
			System.out.println(a);
		
		System.out.println("==========boolean Array==============");
		
		boolean b[] = {false,true,true,false,true};
		
		for(boolean b1:b)
			System.out.println(b1);
		
		System.out.println("===========Long Array==========");
		long arr3[] = {10,23,121,12,12};
		for(long l:arr3)
			System.out.println(l);
		
		System.out.println("==========Dounble Array=========");
		
		double d[]= {10,21.3,12.09,121.90};
		for(double d1:d)
			System.out.println(d1);
		
		System.out.println("=============Byte Array=============");
		byte b1[]= {10,12,34,121,98};
		for(byte b2:b1)			
			System.out.println(b2);
		
		System.out.println("===========");
  }
}