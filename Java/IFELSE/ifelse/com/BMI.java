package ifelse.com;

public class BMI {
	
	public static void main(String[]args) {
		
		int weight = 84;
		double height = 1.65;
		
		double bmi=weight/(height*height);
		
		System.out.println(bmi);
			
		if(bmi<18.5) {
			
			System.out.println("you are underweight");
		}
		else if(bmi>=30&& bmi<=39.9) {
			
			System.out.println("you are in obese range");
		}
		
		else if(bmi>=25) {
			
		       System.out.println("you are in overweight");
	     }
		
		else if(bmi>=18.5&& bmi<=24.9) {
			
			System.out.println("you are in healthy weight");
		}
		
	}
}
