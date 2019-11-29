package set;
import java.util.LinkedHashSet;
import java.util.Set;
public class Linkeshashset {
	
	public static void main(String[]args)
	{
		Set ls=new LinkedHashSet();
		ls.add(10);
		ls.add(20);
		ls.add(10);
		ls.add(30);
		ls.add(20);
		for(Object o:ls)
		{
			System.out.println(o);
		}
		
		
	}

}
