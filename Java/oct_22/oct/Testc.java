package oct;

public class Testc {
	
	public static void main(String[] args) {
		
		SuperClass sup = new SuperClass();
		System.out.println("*******************");
		SubClass sub = new SubClass();
		sub.getData();
		System.out.println("*******************");
		SuperClass s2 = new SubClass();  
	}

}
