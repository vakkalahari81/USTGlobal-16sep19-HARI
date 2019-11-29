package set;
import java.util.Set;
import java.util.HashSet;
public class Test {

	public static void main(String[]args)
	{
		Set s=new HashSet();
		s.add(10);
		s.add(20);
		s.add(30);
		System.out.println(s.add(10));
		s.add(50);
		s.add(12);
		for(Object o:s)
		{
			System.out.println(o);
		}
	}
}
