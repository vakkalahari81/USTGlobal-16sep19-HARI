package invalidCode;

public class TestA {
	
	static int i=0;  
	   
	  static {
   	           for(i=0;i<5;i++)
   	           System.out.println("Static block 2");
             }
        
            {
	           System.out.println(" block 1");
	           i=10;
            }
       
		 TestA()
		 {
			System.out.println("Empty Constructor");
			//main(null);
		 }
		void m1()
		{
			System.out.println("M1 Method");
			TestA obj = new TestA();
		}
		
		public static void main(String[] args)
		{
			TestA obj = new TestA();
			obj.m1();
			
			TestA obj1 = new TestA();
			System.out.println(i);
		}
}
