package hashcode;

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
		return " "+id;
	}
	public int hashCode()
	{
		return id;
	}
	public static void main(String[]args)
	{
		Person obj=new Person("hari",123);
		System.out.println(obj);
	}

}
