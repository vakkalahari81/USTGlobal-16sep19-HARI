package com.ustglobal.comparator;

import java.util.Comparator;

public class SortBySal implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		
		if(o1.salary>o2.salary)
		{
			return 1;
		}
		else if(o1.salary<o2.salary)
		{
			return -1;
		}
		else
			return 0;
	}

}