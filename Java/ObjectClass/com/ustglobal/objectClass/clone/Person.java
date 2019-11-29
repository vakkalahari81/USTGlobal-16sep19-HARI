package com.ustglobal.objectClass.clone;

public class Person implements Cloneable{
	
				int id;
	            String name;
	            
	            @Override
	            protected Object clone()throws CloneNotSupportedException
	            {
					return super.clone();
	            	
	            }
	            
				Person(int id,String name)
				{
					super();
					this.id=id;
					this.name=name;
				}

}
