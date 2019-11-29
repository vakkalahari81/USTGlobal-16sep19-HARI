package array.collections.com;
import java.util.ArrayList;
public class ArrayList1 
{
	public static void main(String[]args)
	{
		ArrayList<Float> al=new ArrayList<Float>();
		al.add((float) 10.1);
		al.add((float) 20.2);
		al.add((float) 30.0);
		System.out.println("Array List Elemnts");
		for(Float i:al)
		{
			System.out.println(i);
		}
		System.out.println("----------------");
		System.out.println(al.get(0));
		System.out.println(al.size());
	}

}
