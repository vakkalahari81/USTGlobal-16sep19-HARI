package com.ustGlobal.hasrelation.weak;

public class Person {
	
	String name;
	Marker m = new Marker();
	
	void sleep() {
		
		System.out.println("person sleep()");
	}
	
	void eat()
	{
		System.out.println("person eat()");
	}
}
