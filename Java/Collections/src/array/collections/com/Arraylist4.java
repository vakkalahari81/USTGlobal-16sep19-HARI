package array.collections.com;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Arraylist4 {
	
	public static void main(String[]args)
	{
		ArrayList<String>list=new ArrayList<String>();
		list.add("10");
		list.add("20");
		list.add("Hari");
		list.add("Ravi");
		list.add("Jaggu");
		//Object[] s=list.toArray();
		System.out.println("String List");
		for(Object o:list)
		{
			System.out.println(o);
		}
		System.out.println("list size="+list.size());
		
		System.out.println("----------Integer List----------------");
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		for(Object o:al)
		{
			System.out.println(o);
		}
		System.out.println(al.size());
		
		
		System.out.println("---------------Byte List----------------");
		List<Integer>b=new LinkedList<Integer>();
		b.add(1);
		b.add(20);
		
	}
}
