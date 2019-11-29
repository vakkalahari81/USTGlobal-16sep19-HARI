package com.hari.equalsmmethod;

public class Book extends java.lang.Object {
			
	 int pages;
	 Book(int p)
	 {
		 pages=p;
	 }
	 public boolean equals(Object y)
	 {
		 if(!(y instanceof Book))
			 return false;
		 
		 return pages==((Book)y).pages;
	 }
}

