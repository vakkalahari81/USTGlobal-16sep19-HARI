package array.collections.com;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList3 {
	
	
	public static void main(String[]args)
	{
		ArrayList al=new ArrayList();	
		Scanner sc=new Scanner(System.in);
		al.add("Java");
		al.add("c");
		al.add("c++");
		al.add("sql");
		
	    al.add(2,"python");
	    ArrayList al1=new ArrayList();
	    al1.add(20);
	    al1.add(30);
	    al1.add(40);
	    //al.add(al1);
	    al.add(0,al1);
	    al.set(1, "dbms");
	    System.out.println("index data="+al.indexOf("java"));
	    System.out.println("set="+al.set(2, "mysql"));
	    for(Object s:al)
	    {
			System.out.println(s);
    	}
    }
}
