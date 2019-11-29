package listInterface;

import java.util.ArrayList;

public class ArrayList1 {
	
	public static void main(String[]args)
	{
		ArrayList al=new ArrayList();
		al.add(20);
		al.add(300);
		System.out.println(al.add(1));
		for(Object e:al)
			System.out.println(e);
		
	}

}
