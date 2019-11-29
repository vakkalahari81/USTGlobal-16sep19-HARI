package com.ustglobal.objectClass;

public class TEstCar {
	
	public static void main(String[] args) {
		
		Car obj = new Car(120000,"bmw","black");
		System.out.println(obj);
		
		System.out.println(obj.hashCode());
	}

}
