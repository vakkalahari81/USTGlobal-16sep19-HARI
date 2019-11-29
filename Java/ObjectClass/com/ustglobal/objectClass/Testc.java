package com.ustglobal.objectClass;

public class Testc {

	public static void main(String[] args) {
			Student s = new Student(1,"abc",76.43);
			//s.display();
			
			int hcode = s.hashCode();
			System.out.println("id="+hcode);
			
			System.out.println("=========================");
			System.out.println(s);
			System.out.println("=========================");
			System.out.println(s.toString());
		}
}
