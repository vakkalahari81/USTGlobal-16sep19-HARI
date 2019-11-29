package com.ustglobal.immutable;

public class TEST {
	
	public static void main(String[] args) {
		
		MyString ms =  new MyString(12,"hari");
		
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		
		System.out.println(ms.changeContent(12,"kdf"));
		
	}

}
