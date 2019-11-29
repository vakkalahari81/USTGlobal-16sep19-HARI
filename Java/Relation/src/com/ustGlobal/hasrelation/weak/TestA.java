package com.ustGlobal.hasrelation.weak;

public class TestA {
	
	public static void main(String[] args) {
		
		Person  p = new Person();
		System.out.println(p.name);
		p.sleep();
		p.eat();
		System.out.println("====================");
		p.m.write();
		
		Music m1 = new Music();
		m1.c.music();
		m1.Songs();
		System.out.println(m1.c.name);
		
		
	}

}
