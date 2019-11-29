package com.ustglobal.objectClass.getClass;

public class Remote {
	
	Remote()
	{
		
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
	  Remote r  = new Remote();
	  System.out.println(r);
	  System.out.println("============================");
	  
	  Class c = r.getClass();
	  System.out.println(c);
	  
	  System.out.println("===========================");
	  
	  Object o = c.newInstance();
	  System.out.println(o);
	  
	  System.out.println("===========================");
	  
	  //edm Object  o1 = r.newInstance();
	}

}
///.kk