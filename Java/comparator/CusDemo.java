package com.ustglobal.comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class CusDemo {
	
					public static void main(String[] args) {
						
						SortBySal s = new SortBySal();
						TreeSet<Customer> ts = new TreeSet<Customer>(s);
						
						Customer c1 = new Customer("hari",1,12000);
						Customer c2 = new Customer("hari",1,1200);
						Customer c3 = new Customer("hari",1,1000);
						Customer c4 = new Customer("hari",1,19000);
						
						ts.add(c1);
						ts.add(c2);
						ts.add(c3);
						ts.add(c4);
						
						System.out.println("===========using Iterator===========");
						
						Iterator<Customer>itr = ts.iterator();
						while(itr.hasNext())
						{
							Customer c = itr.next();
							System.out.println("=============================");
							System.out.println("name = "+c.name);
							System.out.println("Id = "+c.cid);
							System.out.println("fee = "+c.salary);
						}
					}

}

