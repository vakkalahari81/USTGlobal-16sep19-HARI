package stringclass;

import java.util.Scanner;

public class Case {
	public static void main(String[]args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the String");
	  String s=sc.next();
	  String s1=s.toUpperCase();
	  System.out.println(s1);
	  System.out.println(s);
	  String s2=s1;
	  System.out.println(s2);
	  boolean b=s.equals(s1);
	  System.out.println(b);
   }
}
