package list;
import java.util.Vector;
public class Vector1 {
	
	public static void main(String[]args) 
	{
			Vector l=new Vector();
			l.add("Hari");
			l.add(10);
			l.add(20);
			l.add(10.9);
			l.add("sql");
			l.add("Python");
			l.add(1, 'p');
			l.add(1,true);
			for(Object o:l)
			{
				System.out.println(o);
			}
			
  }
}
