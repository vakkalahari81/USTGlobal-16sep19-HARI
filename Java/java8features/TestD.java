package com.ustglobal.java8features;

import java.util.function.Function;

public class TestD {
	
	public static void main(String[] args) {
		
		Function<Integer,Student> f = id->{
			
			Student s = new Student(2,"vijay",56.5);
			s.id = id;
			return s;
		};
		Student s = f.apply(12);
		System.out.println("id is "+s.id);
	}
}
