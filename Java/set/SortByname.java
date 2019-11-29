package com.ustglobal.set;

import java.util.Comparator;

public class SortByname implements Comparator<Bank> {
	
	@Override
	public int compare(Bank o1, Bank o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
