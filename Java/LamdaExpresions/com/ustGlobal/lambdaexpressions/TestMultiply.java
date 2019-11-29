package com.ustGlobal.lambdaexpressions;

public class TestMultiply {
	
	public static void main(String[] args) {
		
		MultiplyInterface mul=(a,b)->a*b;
		
		int product = mul.multiply(10,20);
		System.out.println("product="+product);
	}

}
