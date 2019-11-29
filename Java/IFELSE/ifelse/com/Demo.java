package ifelse.com;

public class Demo {
	
						public static void main(String[]args) {
							
									int x=0;
									
									while(x<4)
									{
											if(x<1)
											{
												System.out.print("a");
												 x=x+1;
											}
											if(x==1) {
												System.out.println(" noise");
												x=x-1;
											}
											if(x==0) 
											{
												System.out.print("annoys");
											    x=x+2;	
											}
											 if(x==4) {
												 System.out.print("oyster");
											 }
											if(x>2)
											{
												System.out.print("an");
												x=x-2;
											}
										
									}
						}
}
