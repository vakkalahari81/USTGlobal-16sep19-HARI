package wrapper.clsss.object;

public class BinaryString {
	
	public static void main(String[]args)
	{
		
		String s1=Integer.toBinaryString(22);
		System.out.println(s1);//form of String you cannot perform arithmetic operations
		int i=Integer.parseInt(s1);
		System.out.println(i+20);
		
		int j=Integer.parseInt(s1,2);
		System.out.println("hi"+j);
		
		
		
		String s2=Integer.toHexString(202);
		System.out.println(s2);
		String s3=Integer.toOctalString(32);
		System.out.println(s3);
	}

}
