package com.ustglobal.Ex;

import java.util.Scanner;

public class TestA {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		try(Scanner sc1  = new Scanner(System.in))
		{
			System.out.println("Enter the Age");
			int age =sc1.nextInt();
			System.out.println(age);
			System.out.println(age/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("finally executed");
		}
	}
}
