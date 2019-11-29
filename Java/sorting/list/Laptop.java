package com.ustglobal.sorting.list;


public class Laptop  implements Comparable<Laptop>{
	
	double fee;
	int ram;
	String name;
	public Laptop(double fee, int ram, String name) {
		super();
		this.fee = fee;
		this.ram = ram;
		this.name = name;
	}
	@Override //sort by fee
	public int compareTo(Laptop o) {
		
		if(this.fee>o.fee)
		{
			return 1;
		}
		else if(this.fee<o.fee)
		{
			return -1;
		}
		else
		{
			return 0;
		}

    }
}
