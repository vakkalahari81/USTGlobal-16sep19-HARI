package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

public class StudentDemo {
	
	public static void main(String[] args) {

		
//		
//		Comparator<Employee>comp = (e1,e2)->{
//			
//			return e1.name.compareTo(e2.name);
//		};
		
//	Comparator<ArrayList<Student>>comp = (e1,e2)->{
//		
//		return e1.name.compareTo(e2.name);
//		
//	};
	SortByName st = new SortByName();
	
	Student s1 = new Student(2,"divya",67.45);
	Student s2 = new Student(5,"pratibha",67.45);
	Student s3 = new Student(22,"harika",67.45);
	
	Student s4 = new Student(21,"bhargavi",67.45);
	Student s5 = new Student(29,"hari",67.45);
	Student s6 = new Student(29,"ananya",67.45);
	
	Student s7 = new Student(29,"ananya",67.45);
	Student s8 = new Student(29,"ananya",67.45);
	Student s9 = new Student(29,"ananya",67.45);
	
	ArrayList<Student> al = new ArrayList<Student>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	
	ArrayList<Student> al1 = new ArrayList<Student>();
	
	al1.add(s4);
	al1.add(s5);
	al1.add(s6);
	
	ArrayList<Student> al2 = new ArrayList<Student>();
	
	al2.add(s7);
	al2.add(s8);
	al2.add(s9);
	
	//HashMap<String,ArrayList<Student>> hm = new HashMap<>();
	
	TreeMap <String,ArrayList<Student>> hm = new TreeMap<String, ArrayList<Student>>();
	
	hm.put("first",al);
	hm.put("Second",al1);
	hm.put("third",al2);
	
	ArrayList<Student>it = hm.get("first");
	
	Iterator<Student>itr =it.iterator(); 
	
	while(itr.hasNext()) {
		
		Student s = itr.next();
		System.out.println("-----------------------------------------");
		System.out.println("id is = "+s.id );
		System.out.println("name is = "+s.name );
		System.out.println("fee is = "+s.fee );
		
		
	}
	
	}	
}
