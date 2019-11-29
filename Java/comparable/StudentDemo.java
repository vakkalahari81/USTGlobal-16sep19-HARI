package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentDemo {
	
	public static void main(String[] args) {
		
		SortByName s1 = new SortByName();
		SortById s2 = new SortById();
		ArrayList<Student>al = new ArrayList<Student>();
		al.add(new Student(14,"Hari",120.3));
		al.add(new Student(101,"Harish",1120.43));
		al.add(new Student(11,"Aneesh",1230.39));
		al.add(new Student(1,"Binesh",1202.1));
		al.add(new Student(12,"Mahesh",1210.4));
		al.add(new Student(2,"Suresh",1208.30));
		
		
		ArrayList<Student>al1 = new ArrayList<Student>();
		al1.add(new Student(13,"ntr",134.6));
		al1.add(new Student(14,"Pavan",174.6));
		al1.add(new Student(130,"Mahesh",154.6));
		al1.add(new Student(113,"Allu",14.6));
		
		//Collections.sort(al);
		
		System.out.println("---------using comparable------------------");
		Collections.sort(al1,s1);
		
		
		Iterator<Student>itr = al1.iterator();
		while(itr.hasNext())
		{
			Student s = itr.next();
			System.out.println(s.name);
			System.out.println(s.id);
			System.out.println(s.fee);
			System.out.println("--------------------");
			
		}
		
	}

}
