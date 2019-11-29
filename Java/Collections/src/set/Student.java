package set;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
public class Student{
	
			public static void main(String[]args)
			{
				Set <Integer>s=new HashSet<Integer>();
				s.add(10);
				s.add(20);
				s.add(30+20);
				s.add(40);
				System.out.println(s.toString());
				
				System.out.println("***Iterating Elements in Set***");
				
				for(Integer o:s)
				{
					System.out.println(o);
				}
				
				System.out.println("****Linked HashSet Elements****");
				Set <Integer>s2=new LinkedHashSet<Integer>();
				s2.add(20);
				s2.add(40);
				s2.add(12);
				s2.add(40);
				s2.add(13);
				System.out.println("To string method="+s2);
				
				
				System.out.println("****This is Sorted Set Elements****");
				SortedSet<Integer> s1=new TreeSet<Integer>();
				s1.add(200);
				s1.add(36);
				s1.add(35);
				s1.add(12);
				SortedSet<Integer>k=s1.tailSet(20);
				System.out.println("Sorted set Sub List");
				System.out.println(k);
				
				System.out.println(s1.toString());
				
				
				System.out.println("This is Sorted Set Elements");
				Set<Integer> s3=new TreeSet<Integer>();
				s3.add(200);
				s3.add(36);
				s3.add(35);
				s3.add(12);
				System.out.println(s3);
				
			}

}
