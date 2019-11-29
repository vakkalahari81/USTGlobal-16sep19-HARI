package com.ustglobal.objectClass.clone;

public class TestA{

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person p = new Person(1,"abc");
		System.out.println("id= "+p.id+"\n"+"name="+p.name);
		
		System.out.println("===========================");
		
		Object o = p.clone();
		Person p2 = (Person)o;
		System.out.println("===========================");
		System.out.println(p2.name);
		System.out.println(p2.id);
		
		p2.id=220;
		p2.name="jagame";
		
		System.out.println("===================After Cloning================");
		
		System.out.println("name="+p.name);
		System.out.println("id="+p.id);
		
		System.out.println("name="+p2.name);
		System.out.println("id="+p2.id);
		
		
	}
}
