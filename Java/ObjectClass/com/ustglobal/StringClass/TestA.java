package com.ustglobal.StringClass;

public class TestA {
	
	public static void main(String[] args) {
	
		String s1="aishu";
		String s2 = "deepika";
		
		String s3=new String("aishu");
		String s4 = new String("aishu");
		
		String s5 = s1;
		System.out.println(s1==s2);
		
		System.out.println(s1==s3);
		
		System.out.println(s3==s4);//always comparing references of the objects equal or not
		System.out.println(s5==s1);
		
		System.out.println(s1.equals(s4));
		
		
		String s6 = s1.toLowerCase();
		System.out.println(s6);
		
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		
		
		char c = s1.charAt(0);
		System.out.println(c);
		
		boolean b = s1.equalsIgnoreCase("AiShu");
		System.out.println(b);
		
		System.out.println(s1.equalsIgnoreCase(s7));
	
		//System.out.println(s7.toString());
		
		
	}

}
