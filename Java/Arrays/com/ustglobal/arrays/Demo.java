package com.ustglobal.arrays;

public class Demo {
	
      public static void main(String[] args) {
		
		Student s1 =new Student(1,"arya",76.4);
		Student s2 =new Student(1,"arya",76.4);
		Student s3 =new Student(1,"arya",76.4);
		
		Student[]s =new Student[3];
		
		s[0]=s1;
		s[1]=s2;
		s[3]=s3;
		
		for(Student s4:s)
		{
			System.out.println(s4);
		}
		received(s);
     }
	  public static void received(Student[]s)
      {
    	  for(Student s1:s)
    		  System.out.println(s1);
      }
}
