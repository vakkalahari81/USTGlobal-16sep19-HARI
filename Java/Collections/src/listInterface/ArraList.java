package listInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArraList{
	
public static void Sort(Object al)
{
	for(int i=0;i<((ArrayList) al).size();i++)
	{
		
	}
	
}
	public static void main(String[]args)
	{
		ArrayList al =new ArrayList();
		al.add(10);
		al.add(201);
		al.add(60);
		al.add(300);
		al.add(40);
		Sort(al);
		//al.addAll(c);
		for(Object i:al)
		{
			System.out.println(i);
		}
	}




}
