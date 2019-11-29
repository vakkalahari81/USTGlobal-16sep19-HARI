package stringclass;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next().toLowerCase();
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
		}
		System.out.println(s2);
		if(s.equals(s2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not Palindrome");
		}
	}

}
