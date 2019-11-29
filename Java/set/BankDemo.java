package com.ustglobal.set;

import java.util.Iterator;
import java.util.TreeSet;

public class BankDemo {
	
					public static void main(String[] args) {
						
						SortByname sb = new SortByname();
						SortByPin sp = new  SortByPin();
						
						TreeSet<Bank> ts = new TreeSet<Bank>(sp);
						
						Bank b1 = new Bank("HDFC",560,64334343);
						Bank b2 = new Bank("SBI",563,4433423);
						Bank b3 = new Bank("ICICI",574,34234343);
						Bank b4 = new Bank("KOTAK",505,14334343);
						Bank b5 = new Bank("UCO",540,54334343);
						Bank b6 = new Bank("AXIS",594,4334343);
						
						ts.add(b1);
						ts.add(b2);
						ts.add(b3);
						ts.add(b4);
						ts.add(b5);
						ts.add(b6);
						System.out.println("********* Using iterator *********");
						Iterator<Bank>itr =ts.iterator(); 
						
						while(itr.hasNext())
						{
							Bank b = itr.next();
							System.out.println("=======================");
							System.out.println("Name = "+b.name);
							System.out.println("Pin = "+b.pin);
							System.out.println("Micr = "+b.micr);
						}
						
					}

}
