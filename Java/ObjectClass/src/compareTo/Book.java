package compareTo;
import java.util.*;
public class Book implements Comparable{
	
	String name;
	int pages;
	int cost;
	Book(String n,int p,int c)
	{
		this.name=n;
		this.pages=p;
		this.cost=c;
	}
	@Override
	public int compareTo(Object o) {
		return cost;
	
			
	}

	public static void main(String[]args)
	{
		Book o=new Book("C",123,50);
		Book o1=new Book("Java",124,100);
	}
}
