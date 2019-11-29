package array.collections.com;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ArrayList2 al=new ArrayList2();
		while(true)
		{
			System.out.println("1.add\n2.display\n3.Addmiddle4.get\n");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the data");
				String s=sc.next();
				al.add(s);
				break;
			case 2:
					al.display();
					break;
			case 3:
					System.out.println("Enter the Index");
					int index=sc.nextInt();
					System.out.println("Enter the data");
					String s1=sc.next();
					al.Add(index,s1);
					break;
			case 4:
						System.out.println(al.get(2));
						break;
			default:
					System.out.println("invalid");
			}
		}

	}

}
