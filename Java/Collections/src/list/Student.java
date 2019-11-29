package list;
import java.util.*;
public class Student extends Employee implements Comparable<Employee>{

	double fee;
	Student(String name, int age,double fee) 
	{
		super(name, age);
		this.fee=fee;
	}
	public int compreTo(Student s) 
	{
		return  (int) (this.fee-s.fee);
	}
	public String toString()
	{
		return name+" "+age+"  "+fee;
	}
	public static void main(String[] args) {
		
		List<Student>list = new LinkedList<Student>();
		list.add(new Student("charan",12,12000));
		list.add(new Student("ishu",91,10000));
		list.add(new Student("chintu",18,11000));
		list.add(new Student("chaitu",62,7000));
		list.add(new Student("barath",32,1200));
		Collections.sort(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
