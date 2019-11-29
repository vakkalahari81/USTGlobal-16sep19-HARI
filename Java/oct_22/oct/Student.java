package oct;

public class Student {
				
			String sname;
			int sid;
			double sfee;
			static String clg="RGUKT";
			String degree="B.Tech";
			String branch;
			
			Student(String sname,int sid,double sfee,String branch)
			{
					this.sname=sname;
					this.sid=sid;
					this.sfee=sfee;
					this.branch=branch;
			}
			public void display()
			{
				System.out.println("----------------Your Details------------");
				System.out.println("college = "+clg);
				System.out.println("name = "+sname);
				System.out.println("sid = "+sid);
				System.out.println("fee = "+sfee);
				System.out.println("Degree = "+degree);
				System.out.println("branch = "+branch);
			}
			
		public static void main(String...args)
		{
			Student s1 = new Student("harish",1,12000,"cse");
			Student s2 = new Student("raveesh",2,21000,"eee");
			Student s3 = new Student("gireesh",3,22000,"ece");
			Student s4 = new Student("suresh",4,13000,"civil");
			Student s5 = new Student("mahesh",5,14000,"mech");
			Student s6 = new Student("nagesh",6,15000,"mme");
			Student s7 = new Student("mallesh",7,16000,"chemical");
			Student s8 = new Student("suresh",8,17000,"cse");
			Student s9 = new Student("ganesh",9,18000,"eee");
			Student s10 = new Student("vignesh",19,22000,"ece");
			Student s11 = new Student("yugesh",11,20000,"cse");
			
			s1.display();
			s2.display();
			s3.display();
			s4.display();
			s5.display();
			s6.display();
			s7.display();
			s8.display();
			s9.display();
			s10.display();
			s11.display();
		}
}
