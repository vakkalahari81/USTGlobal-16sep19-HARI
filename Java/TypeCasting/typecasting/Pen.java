package typecasting;

public class Pen {
	
	int cost;
	void write()
	
	{
		System.out.println("Super class pen method");
	}
	static void m1()
	{
		System.out.println("This is Static method");
	}
}
class Marker extends Pen{
	
	double size;
	String color;
	
	void color()
	{
		System.out.println("This is Color Method");
	}
	static void m1()
	{
		System.out.println("This is  sub class Static method");
	}
	@Override
	public void write()
	{
		System.out.println("Sub Class-method");
	}
}