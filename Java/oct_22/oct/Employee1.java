package oct;

public class Employee1 {

		String name;
		int eid;
		Employee1(String name,int eid)
		{
			this.name=name;
			this.eid=eid;
		}
		public void display()
		{
			System.out.println("--------------------------------");
			System.out.println("name="+name);
			System.out.println("eid="+eid);
			this.sayHello();
		}
		public void sayHello()
		{
			System.out.println("Welcome to Ust Global");
		}
		public String toString()
		{
			return this.name+"\n"+this.eid;
		}
		public static void main(String[] args) {
			
			Employee1 e1 = new Employee1("hari",23);
			Employee1 e2 = new Employee1("koti",24);
	
			System.out.println(e1);
			e1.sayHello();
			e1.display();
			e2.display();
		}
		
}		
