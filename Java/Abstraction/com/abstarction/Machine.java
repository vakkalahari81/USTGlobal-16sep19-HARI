package com.abstarction;

import java.util.Scanner;

public class Machine {
	
				public void validateCard(HDFC m)
				{
					Scanner sc = new Scanner(System.in);

					System.out.println("1.deposit()");
					System.out.println("2.with_Draw()");
					System.out.println("3.check_Balance()");
					System.out.println("Enter Your choice");
					int choice = sc.nextInt();
					switch(choice)
					{
					case 1:
								m.deposit();
								break;
								
					}
					
				}

}
