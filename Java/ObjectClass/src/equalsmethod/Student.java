package equalsmethod;

public class Student {
				String name;
				int id;
				Student(String n,int i)
				{
					name=n;
					id=i;
				}
				public boolean Equals(Object x)
				{
					String name1=this.name;
					int rollno1=this.id;
					Student s=(Student)x;
					String name2=s.name;
					int rollno2=s.id;
					if(name1.equals(name2)&&rollno1==rollno2)
						return true;
					else
						return false;		
					
				}
			public static void main(String[]args)
			{
				Student s=new Student("Hari",120);
				Student s2=new Student("Jaggu",123);
				Student s3=new Student("Hari",120);
				Student s4=s;
				System.out.println(s.equals(s3));//by default it will calls Object class of Default equls Method
				System.out.println(s.equals(s4));
				System.out.println(s.equals(s3));
			}
}
