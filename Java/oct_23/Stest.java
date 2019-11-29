package invalidpackage.com;

public class Stest {
	
	public static void maim(String[] args)
	{
		SuperClass s = new SuperClass();
		           s.count();
		           
		System.out.println("=======================");
		ChildClass c=new ChildClass();
		           c.count();
		           
		System.out.println("=======================");
		SuperClass s1 = new ChildClass();
				   s1.count();
		 
	}

}
