package typecasting;

public class TestB {

	int a;
	static int b;
	static {
			//a=10;	
	}
	{
		a=10;
		b=90;
	}
	float a1=90;
	double a2=a1;
	
	public static void main(String...args)
	{
		Pen p =new Marker();
		p.write();
		p.m1();
		//p.color();
		System.out.println(p.cost);
		
		System.out.println("=============Down Casting============");
		Marker m =(Marker)p;
		System.out.println(m.color);
		System.out.println(m.size);
		m.m1();	
		
	}

}
