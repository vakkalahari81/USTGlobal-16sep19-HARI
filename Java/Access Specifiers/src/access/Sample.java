package access;

public class Sample {
	public static void main(String[] args) {
	Demo d  =new Demo();
		
		//private
		
		//System.out.println(d.a);
		//d.add();
		
		//default
		 System.out.println(d.b);
		 d.sub();
		
		//protected
		   System.out.println(d.c);
		   d.mul();
		   
		//public
		   System.out.println(d.name);
		   d.div();
	}

}
