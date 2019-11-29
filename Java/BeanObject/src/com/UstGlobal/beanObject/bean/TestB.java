package com.UstGlobal.beanObject.bean;

import java.util.Scanner;

public class TestB {
	
	public static void main(String[] args) {
		
		System.out.println("Scanner class");
		Scanner sc  = new Scanner(System.in);
		
		String str = sc.nextLine();	
		System.out.println(str);
		
		System.out.println("Enter the String");
		String s = sc.next();
		System.out.println(s);
		
		System.out.println("Enter the true or false");
		boolean b =sc.nextBoolean();
		System.out.println(b);
			
	}

}
