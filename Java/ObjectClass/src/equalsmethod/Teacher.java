package equalsmethod;

public class Teacher {
	
			String name;
			int num;
			float sal;
			Teacher(String name,int num,float sal)
			{
				this.name=name;
				this.num=num;
				this.sal=sal;
			}
			public boolean equals(Object x)
			{
				try
				{
				 if(x instanceof Teacher)
				  {
					Teacher t=(Teacher)x;
					if(name.equals(t.name)&&num==t.num)
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				return false;
			  }
				catch(ClassCastException e)
				{
					return false;
				}
			}
			public static void main(String[]args)
			{
				Teacher t1=new Teacher("Harish",1381,12000);
				Teacher t2=new Teacher("Hari",1382,12000);
				Student s1=new Student("Hari",1381);
				System.out.println(t1.equals(t2));
		
			}
			
			
}
