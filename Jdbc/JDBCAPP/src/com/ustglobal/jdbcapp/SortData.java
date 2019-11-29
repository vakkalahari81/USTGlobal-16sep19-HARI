package com.ustglobal.jdbcapp;
import java.util.Comparator;
public class SortData implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.toLowerCase().compareTo(o2.name.toLowerCase());
	}


}
