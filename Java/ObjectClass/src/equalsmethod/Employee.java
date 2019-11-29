package equalsmethod;

public class Employee {
	
			String name;
			int id;
			float sal;
			Employee(String name,int id,float sal)
			{
				this.name=name;
				this.id=id;
				this.sal=sal;
			}
				
			public boolean equals(Object x)
			{
				if(x instanceof Employee)
				{
				 Employee e=(Employee)x;
				 if(name.equals(e.name)&&id==e.id&&sal==e.sal)
				 {
					return true;
				 }
				 /*else if(name.equals(e.name)&&sal==e.sal)
				 {
					 return true;
				 }*/
				 else
					return false;
			    }
				else
					return false;
			}
			public static void main(String[]args)
			{
				Employee e=new Employee("Hari",123,12000);
				Employee e1=new Employee("Hari",124,12000);
				
				System.out.println(e.equals(e1));
				System.out.println(e.equals(e1));
				//System.out.println(e.equals(s));
			}

}
