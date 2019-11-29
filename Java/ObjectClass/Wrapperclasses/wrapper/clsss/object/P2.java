package wrapper.clsss.object;

public class P2 {
	
	int i;
	P2(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return ""+i;
	}
	public static void main(String[]args)
	{
		int i=20;
		Integer I=new Integer(i);//already overridden toString method in Integer class
		System.out.println(I.toString());
	     P2 p1= new P2(20);//explicitly we should override toString method.
	     System.out.println(p1);
	     
	}
}

