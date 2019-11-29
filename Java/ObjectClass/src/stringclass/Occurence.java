package stringclass;

import java.util.Scanner;

public class Occurence {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		String s=sc.next();
		while(s.length()>0)
		{
			int count=s.length()-s.replace(s.charAt(0)+"","").length();
			
			System.out.println(s.charAt(0)+"="+count);
			s=s.replace(s.charAt(0)+"","");
		}
		
		
	}

}
