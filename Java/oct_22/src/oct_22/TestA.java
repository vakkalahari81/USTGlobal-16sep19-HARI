package oct_22;

public class TestA {
	
	public static void add(int a,int b) {
		
			System.out.println("int-int method");
	}
	public static void add(int a,float b) {
		
		System.out.println("int-float method");
	}
	public static void main(String[] args) {
		
		add(100,200);
		
	}
}
