package com.UstGlobal.beanObject.bean;

public class TestA {
	
	public static void main(String[] args) {
		
		Student s = new Student();
			s.setId(12);
			s.setName("shivagami");
			s.setRollno(132);
			
			DataBase d = new DataBase();
			d.receive(s);
			
	}

}
