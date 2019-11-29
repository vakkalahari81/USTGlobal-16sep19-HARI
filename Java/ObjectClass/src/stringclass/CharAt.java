package stringclass;
import java.util.Scanner;
public class CharAt {
	        static boolean b;
			public static void main(String...rgs)
			{
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the String");
				String s=sc.next();
				System.out.println("Enter the String");
				String s1=sc.next();
				if(s.length()!=s1.length())
				{
					System.out.println("Not Equal");
				}
				else
				{
				   for(int i=0;i<s.length();i++)
				    {
					   //System.out.println("This is b="+b);
					   b=false;
					   if(s.charAt(i)!=s1.charAt(i))
					   {
						 System.out.println("Not Equal");
						 break;
					   }
					   else
					   {
						 b=true;
					   }
				    }
				}
				if(b==true)
				{
					System.out.println("Equal");
				}
		}
 }
