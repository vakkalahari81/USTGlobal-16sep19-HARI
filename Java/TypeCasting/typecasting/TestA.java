package typecasting;

public class TestA {
	
	public static void main(String...args)
	{
		byte a =12;
		int b=a;
		System.out.println(b);
		
		double d =b;
		System.out.println(d);
		
		
		byte b2 ='=';
		System.out.println(b2);
		
		/*float f =(float)d;
		System.out.println(f);*/
		
		System.out.println("=========================");
		
		double x =12;
		int y =(int)x;
		System.out.println(y);
		
		float f1 =(int)x;
		System.out.println(f1);
		
		byte b1 =(byte)f1;
		System.out.println(b1);
		
		
	}

}
