public class Demo {
public static void main(String[] args)	{
		
		int sum = 0;
		for(int i = 0 ; i< 10 ; i++) {
			sum += i; 
                 }

                System.out.println("sum of 10 numbers=" +sum);

		sum = 0;
		
                for(int i=0;i<100;i++) {
			sum += i; 
                 }

		System.out.println("sum of 100 numbers=" +sum);

		sum = 0;

		for(int i = 0;i<1000; i++){
			sum+= i; 
                 }  
                 System.out.println("sum of 1000 numbers="+sum);
   }

}