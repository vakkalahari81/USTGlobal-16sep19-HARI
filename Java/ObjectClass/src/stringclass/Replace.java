package stringclass;

public class Replace {
	
	public static void main(String[]args)
	{
		String s="Java";
		String s1=s.replace('a', 'v');
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s1.replace('v',' '));
		System.out.println(s1);
		System.out.println(s.replace("a","").toUpperCase());
		
		
	}

}
