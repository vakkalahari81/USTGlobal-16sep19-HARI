package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class HelperStu {
	
	void displayAllStudent(ArrayList<Student> al)
	{
		Iterator<Student>s = al.iterator();
		System.out.println("============displaying all students details==============");
		while(s.hasNext())
		{
			Student s1 = s.next();
			System.out.println("id is = "+s1.id);
			System.out.println("name is = "+s1.name);
			System.out.println("percentage is = "+s1.per);
			System.out.println("---------------------------------------------");
		}
	}
	void failedStudents(ArrayList<Student>al)
	{
		List<Student>l2 = al.stream().filter(student->student.per<40).collect(Collectors.toList());
		Iterator<Student>itr = l2.iterator();
		System.out.println("==================Failed Students================");
		while(itr.hasNext())
		{
			Student s = itr.next();
			System.out.println("name = "+s.name);
			System.out.println("Id = "+s.id);
			System.out.println("Percentage = "+s.per);
			System.out.println("-----------------------------------------------------");
		}
	}
	void passedStudents(ArrayList<Student>al)
	{
		List<Student>l2 = al.stream().filter(student->student.per>40).collect(Collectors.toList());
		Iterator<Student>itr = l2.iterator();
		System.out.println("============Passed Students===============");
		while(itr.hasNext())
		{
			
			Student s = itr.next();
			System.out.println("name = "+s.name);
			System.out.println("Id = "+s.id);
			System.out.println("Percentage = "+s.per);
			System.out.println("-------------------------------------------");
		}
	}
	void topperStudent(ArrayList<Student> al)
	{
        Comparator<Student>cmp = (e1,e2)->{
        	if(e1.per>e2.per)
        	{
        		return 1;
        	}
        	else if(e1.per<e2.per)
        	{
        		return -1;
        	}
        	else
        		return 0;
		  };
		Student l = al.stream().max(cmp).get();
		System.out.println(l.name);
		System.out.println(l.id);
		System.out.println(l.per);
	}
}
