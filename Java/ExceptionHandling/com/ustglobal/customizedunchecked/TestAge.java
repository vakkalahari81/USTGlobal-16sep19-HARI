package com.ustglobal.customizedunchecked;

public class TestAge {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		Validator v  = new Validator();
		
		v.verify(8);
		
		
		System.out.println("main ended");
	}

}
