package com.ustglobal.java8features;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestE {
	
	public static void main(String[] args) {
		
		Supplier<Student>s = ()->new Student(2,"ajay",65.5);
		Student s1 = s.get();
	    System.out.println(s1.id);
	    System.out.println(s1.name);
	    System.out.println(s1.per);
	
		 	Supplier<Integer> i = ()->20;
	 		int val = i.get();
	 		System.out.println(val);
	 		
	 		System.out.println("consumer");
	 		Consumer<Student> c = s2 ->{
	 			System.out.println("id = "+s2.id);
	 			System.out.println("id = "+s2.name);
	 			System.out.println("id = "+s2.per);
	 		};
	 		c.accept(new Student(1,"vijay",35.43));
	}

}
