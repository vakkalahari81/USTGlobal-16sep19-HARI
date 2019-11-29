package com.hari.equalsmmethod;

public class DEmo {
		public static void main(String[]args)
		{
			Object o1=new Book(100);
			Object  o2=new Book(100);
			//System.out.println(o1==o2);
			System.out.println(o1.equals(o2));
		}
	}

