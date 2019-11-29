package exception.handling;

public class Axception { 
	
				public static void main(String[]args) { //throws IOException 
					
					 int a=10;
        	         int b=1;
        	         String s=null;
        	         System.out.println(s);
					 try {
							 System.out.println(s.length());
					       	 double div=a/b;
					         System.out.println(div);
					          
				         }
					catch(Exception e) {
					    	System.out.println("denomintor never be zero");
					 }
					finally {
						System.out.println("end");
					}
            }
}
