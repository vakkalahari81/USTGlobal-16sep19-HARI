package map;

public class Student implements Comparable<Student>{
	
	int id;
	String name;
	double fee;
	public Student(int id, String name, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	/*@Override //Sort By Name
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name);
	}*/
	
	/*@Override //SortBy Id
	public int compareTo(Student o) {
		
		return this.id-o.id;
	}*/
	
	@Override
	public int compareTo(Student o) {
		
		return (int) ((int)this.fee-o.fee);
	}
	
	
	

}
