package com.abstarction;

import java.util.Scanner;

public class BankDemo {

				public static void main(String[] args)
				{
					Scanner sc = new Scanner(System.in);
					
					Machine m = new Machine();
					HDFC h =new HDFC();
					
					m.validateCard(h);

						
				}
}
