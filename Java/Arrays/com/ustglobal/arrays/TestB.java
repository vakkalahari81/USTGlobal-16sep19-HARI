package com.ustglobal.arrays;

public class TestB {

	
	public static void main(String[] args) {
		
		int num[] = {20,23,132,23,23,23,49};
		
		received(num);
		
		System.out.println("===========Get Array methods========");
		int[] values = getArray();
		for(int i:values)
			System.out.println(i);
		
		
		String str[]= {"abc","cde","efg","hij"};
		
		data(str);
		
		String[] s1 = getArray1();
		System.out.println("===========get Array method=========");
		for(String s2:s1)
			System.out.println(s2);
	}
	public static void data(String[] arr)
	{
		System.out.println("===========String Array============");
		for(String s:arr)
			System.out.println(s);
		
	}
	static String[] getArray1()
	{
		String s1[] = {"hij","klmn","opqrs","tuvw"};
		return s1;
	}
	public static void received(int[] num)
	{
		System.out.println("============normal function=============");
		for(int i:num)
		System.out.println(i);
	}
	
	static int[] getArray()
	{
		int values[] = {10,12,12,12,12};
		return values;
	}
	
	
}
