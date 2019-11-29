package com.ustglobal.comparator;

import java.util.Comparator;

public class SortByColor implements Comparator<Marker>{

	@Override
	public int compare(Marker o1, Marker o2) {
		
		if(o1.color.compareTo(o2.color)>0)
		{
			return 1;
		}
		else if(o1.color.compareTo(o2.color)<0)
		{
		  return -1;
	    }
		else
		{
			return 0;
		}
    }
}
