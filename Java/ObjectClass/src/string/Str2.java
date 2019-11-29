package string;

public class Str2 {
	
	public static void main(String[]args)
	{
		String s=new String("Hari");
		String s1="Jspiders";
		String s2=s1.concat(s);
		System.out.println(s2);
		String s3=s1.concat("Qspiders");
		System.out.println(s3);
		char ar[]=s3.toCharArray();
		System.out.println((int)ar[0]);
	}
}

