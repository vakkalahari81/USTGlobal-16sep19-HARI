package stringclass;
import java.util.Scanner;

public class Replace2 {
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		String s="Harri";
		String s1=s.replace('r', 'l');
		System.out.println(s1);
		System.out.println(s);
		s=s.replace('r', 's');
		System.out.println(s+s1);
		System.out.println(s);
		
	}

}
