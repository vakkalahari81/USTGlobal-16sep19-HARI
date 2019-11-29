package myinterface.com;

public class BMW  implements AutoMobile,AutoMobileWithAbs{

	@Override
	public int gear(){
		
		System.out.println("gear() method");
		return 0;
	}

	@Override
	public void gps() 
	{
		System.out.println("gps() method");
	}
	
	public void abs()
	{
		System.out.println("Abs() of BMW");
	}

}
