package invalidpackage.com;

public class Student {
	
				String name;
				int rollno;
				final  String cname="Qspiders"; 	
				final int cid;
				Student()
				{
					this.cid=20;
				}
				Student(String name,int rollno,int cid)
				{
					this.name=name;
					this.rollno=rollno;
					this.cid=cid;
				}
				final void printDetails()
				{
					rollno=123;
					System.out.println("Hi "+name+" welcome to "+ cname+" Your Roll number is="+rollno);
				}
				final void printDetails(String name)
				{
					System.out.println("Hi"+name+ "welcome to "+ cname);
				}

}
