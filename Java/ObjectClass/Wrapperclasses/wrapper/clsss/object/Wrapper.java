package wrapper.clsss.object;
import java.lang.*;
public class Wrapper {
	
	public static void main(String[]args)
	{
		int a=20;
		Integer I=new Integer(a);
		System.out.println(I.toString());
		
		int p=I.valueOf(I);
		System.out.println(p);
	}
}
