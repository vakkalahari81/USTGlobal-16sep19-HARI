package hashcode;

public class Person1 {
	
	int id;
	String name;
	Person1(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public int hashCode()
	{
		return 1;//for all objects same hashcode() in this case
	}
	public static void main(String[]args)
	{
		Person1 p=new Person1("abc",12);
		System.out.println(p);
		Person p2=new Person("def",13);
		System.out.println(p2);
	}

}
