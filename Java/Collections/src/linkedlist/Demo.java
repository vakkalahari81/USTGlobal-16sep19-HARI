package linkedlist;

import java.util.Scanner;

public class Demo {
	
				public static void main(String...args)
				{
					Scanner sc=new Scanner(System.in);
					while(true)
					{
						System.out.println("1.Insertion\n2.Display");
						System.out.println("Enter your choice");
						int ch=sc.nextInt();
			            Linkedlist sl=new Linkedlist();
			 
						switch(ch)
						{
						  case 1:
							  System.out.println("Enter the Node Data");
							  String e=sc.next();
							  sl.add(e);
							break;
						  case 2:
							  		sl.display();
							  		break;
							 default:
								 	System.out.println("Invalid Option");
						}
						
					}
				}
}
