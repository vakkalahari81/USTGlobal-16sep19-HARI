package wrapper.clsss.object;

public class Wrapper2 {
	
	public static void main(String[]args)
	{
		int a=320;
		Object o=Integer.valueOf(a);
		int p=(Integer)o*a;
		System.out.println(p);
		Integer b=120;
		System.out.println(b);
	}

}
