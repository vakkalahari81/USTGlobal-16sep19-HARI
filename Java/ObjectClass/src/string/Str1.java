package string;

public class Str1 {
	
	public static void main(String[]args)
	{
		String str="Hari";
		String str1="Hari";
		System.out.println(str.equals(str1));
		System.out.println(str==str1);
		System.out.println("----------------------------");
		String s1=new String("Hari");
		System.out.println(s1.equals(str));
		System.out.println(s1==str1);
	}
}
