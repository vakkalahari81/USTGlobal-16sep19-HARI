package com.ustglobal.objectClass;

public class Cow {
	
				int id;
				String name;
				double cost;
				public Cow(int id, String name, double cost) 
				{
					super();
					this.id = id;
					this.name = name;
					this.cost = cost;
				}
				public boolean equals(Object obj)
				{
					Cow c = (Cow)obj;
					
					if(this==c)
					{
						return true;
					}
					
					//if(this.id=c.id &&(this.name.equals(c.name))&&this.cost==c.cost)
					if(this.id==c.id)
					{
						if(this.name.equals(c.name))
						{
							if(this.cost==c.cost)
							{
								return true;
							}
							else
							{
								return false;
							}
						}
						else
						{
							return false;
						}
					}
					else
					{
						return false;
					}
					
				}
}

