package oct;

public class SubClass extends SuperClass{
	
	String s = "subclass variable";
	
	SubClass()
	{
		//super();
		System.out.println("Sub Class COnstructor");
	}
	public void getData()
	{
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("******************");
		super.superClassMethod();
		
	}
}
