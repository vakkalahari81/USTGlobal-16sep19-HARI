package com.ustGlobal.lambdaexpressions;

public class TestAdd implements AddInterface{

	@Override
	public int add(int a, int b){
		
		return a + b;
	}

	public static void main(String[] args) {
		
		TestAdd t1 = new TestAdd();
		int sum = t1.add(12,30);
		System.out.println(sum);
	}
}
