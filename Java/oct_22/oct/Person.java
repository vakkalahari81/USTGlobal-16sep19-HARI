package oct;

public class Person {
	
		String name;
		int id;
		static String com="Ust";
		Person()//Zero Arguments Constructor
		{
			
		}
		Person(String name,int id)//Parameterized Constructor
		{
			this.name=name;
			this.id=id;
		}
		Person(Person p)
		{
			this.name=p.name;
			this.id=p.id;
		}
		public void display() 
		{
			System.out.println("------------------------------");
			System.out.println("namr="+this.name);
			System.out.println("id="+this.id);
			System.out.println("company name="+com);
		}
		public String toString()
		{
			return name+"\n"+id;
		}
		public void Show(Object o)
		{
			System.out.println("----------show Method----------");
			System.out.println(o);
		}
		public static void main(String[] args) 
		{
			Person p= new Person("hari",124);
			p.display();
			
			Person p1=new Person("sasi",113);
			p1.display();
			
			//passing Object To Function
			Person p3 = new Person();
			p3.Show(p1);
			p3.Show(p);
			
			//Copy Constructor
			  Person p4 = new Person(p);
			  p4.display();
		}
}
