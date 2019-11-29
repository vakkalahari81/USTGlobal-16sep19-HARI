package list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Employee implements Comparable <Employee> {
	
			    String name;
			    int age;
				Employee(String name,int age)
				{
					this.name=name;
					this.age = age;
				}
				public String toString()
				{
					return name+" "+age;
				}
				public int compareTo(Employee e) 
				{
					//System.out.println("this="+this.age);
					//System.out.println("e="+e.age);
					return this.age-e.age;
				}
				public static void main(String[]args) 
				{
					Employee e1=new Employee("Hari ",10);
					Employee e2=new Employee("Ravi ",200);
					Employee e3=new Employee("Jaggu ",30);
					Employee e4=new Employee("Rafi ",40);
					
					List<Employee>l1=new ArrayList<Employee>();
					
					l1.add(e1);
					l1.add(e2);
					l1.add(e3);
					l1.add(e4);
					System.out.println(l1);
					 Collections.sort(l1); 
					Iterator itr = l1.iterator();
					while(itr.hasNext())
					{
						System.out.println(itr.next());
					}
				}
 }
