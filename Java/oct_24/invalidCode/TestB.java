package invalidCode;

public class TestB {
	
	static int b;
	int a;
	{
		a=10;
		b=20+1;
		System.out.println(b);
		System.out.println(a);
		System.out.println("non static block 1");
	}
	TestB()
	{
		System.out.println("Empty Constructor");
	}
	
	public static void main(String[] args) 
	{
			System.out.println("main started");
			TestB b1 = new TestB();
			System.out.println(b);
			System.out.println("===============================");
			TestB b2 = new TestB();
			System.out.println("main ended");
	}
	{
		System.out.println("non static block 2");
	}

}
