package hashcode;

public class Person2 {

	String name;
	int id;
	Person2(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public String toString()
	{
		return id+"\n"+name;
	}
	public int hashCode()
	{
		return id;
	}
	public static void main(String[]args)
	{
		Person2 obj=new Person2("hari",12);
		System.out.println(obj);
		System.out.println("hash code="+obj.hashCode());
		Person2 obj1=new Person2("raveesh",13);
		System.out.println(obj1);
		System.out.println("hash code="+obj1.hashCode());
		
	}
}
