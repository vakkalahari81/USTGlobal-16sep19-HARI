package oct;

public class Bus {
	int seats;
	String color;
	
	Bus(int seats,String color)
	{
		this.seats=seats;
		this.color=color;
	}
	Bus()
	{
		this(40);
	}
	Bus(int seats)
	{
		this(40,"red");
	}
	public void getDetails()
	{
		System.out.println("Welcome to red Bus, Bus Capacity is "+seats);
	}
}
