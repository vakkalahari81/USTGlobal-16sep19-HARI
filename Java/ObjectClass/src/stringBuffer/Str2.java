package stringBuffer;

import java.util.Scanner;

public class Str2 {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		StringBuffer st=new StringBuffer(str).append("Nath");
		System.out.println(st);
		System.out.println(str.charAt(0));
		System.out.println();
	}

}
