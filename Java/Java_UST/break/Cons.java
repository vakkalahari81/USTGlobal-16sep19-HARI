class Cons{
		static void m1(int a,float b)
		{
			System.out.println("int-float");
		}
		static void m1(float a,int b)
		{
			System.out.println("float-int");
		}
		public static void main(String[]args)
		{
			m1(10,20);
			m1(20,10);
		}
}
			