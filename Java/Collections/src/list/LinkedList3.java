package list;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
public class LinkedList3 {
	
	public static void main(String[]args)
	{
		LinkedList l=new LinkedList();
		l.add(20);
		l.add(20);
		l.add(12);
		l.add(22);
		l.add(7);
		for(Object o:l)
		{
			System.out.println(o);
		}
		
		
		Collections.sort(l);
		System.out.println("After Sorting");
		for(Object o:l)
		{
			System.out.println(o);
		}
		Object[] arr=l.toArray();
		System.out.println("Converting Array");
		for(Object o:arr)
		{
			System.out.println(o);
		}
	}
}
     