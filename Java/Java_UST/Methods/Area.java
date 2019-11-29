class Area
{
	public static void main(String[] args)
	{
		double r =12;
		area(r);
		double d=circumference(r);
		System.out.println("circumference = "+d);
		boolean b =oddEven(10);
		if(b==true)
		{
			System.out.println("Even");
		}
		else
                {
			System.out.println("Odd");
		}
         }
	static void area(double r)
	{
		double d = 3.14*(r*r);
		System.out.println("Area="+d);
	}
	static double circumference(double r)
	{	
			
		double d=2*(3.14)*r;
		return d;	
       }
	static boolean oddEven(int num)
	{
		if(num%2==0)
		{
			return true;
		}
		else
               {
		return false;
      	      }
       }
		
}
	