package com.ustglobal.set;

import java.util.Comparator;

public class SortByPin implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		
		Integer i = o1.pin;
		Integer j = o2.pin;
		
		return i.compareTo(j);
	}
}
