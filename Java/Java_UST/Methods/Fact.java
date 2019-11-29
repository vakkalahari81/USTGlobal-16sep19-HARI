class Fact{
		public static void main(String[]args)
		{
			int num=5;
			int res=factorial(num);
			System.out.println(res);
		}
		static int factorial(int num)
		{
			int f=1;
			while(num>0)
			{
				f=f*num--;
			}
			return f;
		}
}
				

		