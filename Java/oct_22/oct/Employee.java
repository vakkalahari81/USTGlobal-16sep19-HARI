package oct;
public class Employee extends Person {
	
			double sal;
			Employee(String name,int id,double sal)
			{
				super(name,id);
				this.sal=sal;
			}
			public void display()
			{
				System.out.println("name="+this.name);
				System.out.println("id="+this.id);
				System.out.println("salary="+this.sal);
			}
}
