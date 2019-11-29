package com.ustglobal.objectClass;

public class USBPort {
	
	
	public static void m1(Object obj)
	{
		if(obj instanceof Pendrive)
		{
		   Pendrive o = (Pendrive)obj;
		    o.read();
	    	o.write();
	    }
		else if(obj instanceof Mouse)
		{
			Mouse o=(Mouse)obj;
			o.click();
			o.move();
		}
		else {
			System.out.println("Invalid Object you passing");
		}

   }
}