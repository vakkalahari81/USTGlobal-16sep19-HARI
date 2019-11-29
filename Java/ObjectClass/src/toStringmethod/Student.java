package toStringmethod;

public class Student {
		String name;
		int rollno;
		double fee;
		Student(String name,int rollno,double fee)
		{
			this.name=name;
			this.rollno=rollno;
			this.fee=fee;
		}
		Student(int rollno)
		{
			this.rollno=rollno;
		}
		public String toString()
		{
			String str= name+"\n"+rollno+"\n"+fee;
			return str;
		}
		public static void main(String...args)
		{
			Student obj=new Student("hari",1381,150000);
			System.out.println(obj.toString());
			Student obj1=new Student(1391);
			System.out.println(obj1);
		}
}
