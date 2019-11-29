package set;
import java.util.SortedSet;
import java.util.TreeSet;
public class Treeset {
	
	public static void main(String[]args)
	{
		SortedSet s=new TreeSet();
		s.add(20);
		//s.add("Hari");
		s.add(40);
		s.add(30);
		s.add((int)'c');
		for(Object o:s)
		{
			System.out.println(o);
		}
	}
}
 