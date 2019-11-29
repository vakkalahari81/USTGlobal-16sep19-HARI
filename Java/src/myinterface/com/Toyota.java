package myinterface.com;

public class Toyota implements AutoMobile {

	@Override
	public int gear() {
		System.out.println("Toyota gear() Method");
		return 0;
	}

	@Override
	public void gps() {
		System.out.println("Toyota() gps Method");
	}

}
