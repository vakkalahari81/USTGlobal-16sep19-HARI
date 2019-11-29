package com.ustglobal.streams.list;

import java.util.ArrayList;

public class StudList {
	
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(5,"ajay",75.6));
		al.add(new Student(6,"vijay",65.56));
		al.add(new Student(1,"pant",98.4));
		al.add(new Student(11,"kohli",48.4));
		al.add(new Student(13,"yuvi",38.4));
		al.add(new Student(12,"iyer",58.4));
		al.add(new Student(118,"yash",23.4));
		
		HelperStu h = new HelperStu();
		
		h.displayAllStudent(al);
		h.failedStudents(al);
		h.passedStudents(al);
		h.topperStudent(al);
	}

}
