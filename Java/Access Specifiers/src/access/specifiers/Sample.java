package access.specifiers;

import access.Demo;

public class Sample extends Demo {
	
	public static void main(String[] args) 
	{
         Demo d  =new Demo();
		
         Sample s = new Sample();
		//private
		
		//System.out.println(d.a);
		//d.add();
		
		//default
		 //System.out.println(d.b);
		 //d.sub();
		
		//protected
		   System.out.println(s.c);
		   s.mul();
		   
		//public
		   System.out.println(d.name);
		   d.div();
	}
	}
