package com.ustglobal.arrays;

public class Student {
	
	int i;
	String s1;
	double per;
	
	
	
	public Student(int i, String s1, double per) {
		super();
		this.i = i;
		this.s1 = s1;
		this.per = per;
	}



	@Override
	public String toString() {
		return "Student [i=" + i + ", s1=" + s1 + ", per=" + per + "]";
	}
}
