package ifelse.com;

public class Vote {
	
	static int age=18;
	public static void main(String...args) {
		if(age<18) {
			System.out.println("Not Eligible For Voting");
		}
		else {
			System.out.println("Eligible");
		}
	}

}
