package list;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
public class LinkedList1 {
	
	public static void main(String...args)
	{
		List l=new LinkedList();
		l.add(60);
		l.add(70);
		l.add(40);
		l.add(10);
		l.add(20);
		l.add(70);
		//l.add(2,13);
		System.out.println("LinkedList ELements");
		for(Object o:l)
		{
			System.out.println(o);
		}
		System.out.println("----------------------------------");
		List l1=new ArrayList();
		l1.add(60);
		l1.add(70);
		l1.add(40);
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		System.out.println("ArrayList Elements");
		System.out.println("----------------------------------");
		for(Object o:l1)
		{
			System.out.println(o);
		}
		System.out.println("----------------------------------");
		System.out.println("After Adding LinkedList");
		//l.add(3,l1);
		//l.removeAll(l1);
		for(Object o:l)
		{
			System.out.println(o);
		}
		System.out.println("emty="+l.isEmpty());
		System.out.println("size="+l.size());
		System.out.println("get="+l.get(2));
		System.out.println("set="+l.set(1, 12));
		System.out.println("contains="+l.containsAll(l1));
		System.out.println("contains="+l1.containsAll(l));
		
			
	}

}
