package com.ustgloaba;

public class TestA {
	
	
			   TestA(Object a)
			   {
				   System.out.println("Object="+a);
			   }
	           TestA(int i)
	           {
		           System.out.println("primitive="+i);
	           }
			   TestA(Integer i)
			   {
					System.out.println("Integer="+i);
			   }
				
			public static void main(String...args)
			{
				int a =10;
				System.out.println("a is "+a);
				
				Integer i =a;
				System.out.println("i is "+i);
				
				new TestA(i);
				
				double d =10.23;
				Double f =d;
				new TestA(f);
				
				boolean b = Boolean.parseBoolean("True");
				System.out.println(b);
				
				int p =Integer.parseInt("123sdsd");
				System.out.println(p);
				
				
			}

}
