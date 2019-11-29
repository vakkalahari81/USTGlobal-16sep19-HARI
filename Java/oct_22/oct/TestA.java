package oct;
public class TestA {
	
	public static void  add(int a,int b)
	{
		System.out.println("int-int method");	
	}
    public static void  add(int a,double b) 
    {	
		System.out.println("int-double method");	
		add(10,20);
	}
    public float add(int a,float b)
    {
    	return a+b;
    }
    public static void main(int a) 
    {
    	 System.out.println("main method overloaded");
    	 TestA obj =new TestA();
    	  obj.add(10,20,30);
    	 //obj.add(10,30);
    }
    void add(int a,int b,int c)
    {
    	System.out.println("Three parameters");
    	add(10,0);
    	
    }
	public static void main(String[] args) 
	{
			add(10,21);
			main(12);
			add(1,2.3);
	}
}
