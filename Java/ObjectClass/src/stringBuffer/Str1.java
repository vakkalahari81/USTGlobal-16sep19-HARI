package stringBuffer;

public class Str1 {
	
	public static void main(String[]a)
	{
		StringBuffer sb=new StringBuffer("Hari");
		StringBuffer sb1=new StringBuffer("Hari");
		StringBuffer sb2=sb1;
		System.out.println(sb1.equals(sb));
		System.out.println(sb1==sb);
		System.out.println(sb2==sb1);
		System.out.println(sb2.equals(sb1));
		
		
		
	}

}
