package oct;

public class TestD {
	
	final void add()
	{
		System.out.println("add() Method");
	}
	final void add(int a)
	{
		System.out.println("add()-int method");
	}
	final void add(int a,int b)
	{
		System.out.println("add() int-int method");
	}
	public static void main(String[]args)
	{
		TestD t1 = new TestD();
		t1.add(10);
	}

}
