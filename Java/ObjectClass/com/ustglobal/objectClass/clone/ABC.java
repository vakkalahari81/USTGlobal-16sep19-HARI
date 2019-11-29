package com.ustglobal.objectClass.clone;

public class ABC {
	
	public static void main(String[] args) {
		
		String s = new String("Abcd");
		String s1 ="hari is a good boy";
		
		String s3="";
		System.out.println(s.equalsIgnoreCase(s1));
		
		System.out.println(s.lastIndexOf("bcd"));
		
		byte b[] = s1.getBytes();
		
		//for(byte b1 : b)
			//System.out.println((char)b1);
		
		System.out.println(s.indexOf('c'));
		
		char []ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		System.out.println("sub string method");
		System.out.println(s1.substring(0,4));
		
		System.out.println(s3.isEmpty());
		
		System.out.println("contains");
		System.out.println(s.conta);
		
	
	}

}
