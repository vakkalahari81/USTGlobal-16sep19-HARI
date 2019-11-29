package toStringmethod;

public class Person {
	
	String name;
	int id;
	Person(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public String toString()
	{
		return name+"\n"+id;
	}
	public static void main(String[]args)
	{
		Person obj=new Person("Hari",1391);
		System.out.println(obj);
		Person ob=new Person("raveesh",1932);
		System.out.println(ob);
		System.out.println(new Person("abc",20));
	}
}
