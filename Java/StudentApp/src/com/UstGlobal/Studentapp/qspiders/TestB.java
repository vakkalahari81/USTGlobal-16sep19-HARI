package com.UstGlobal.Studentapp.qspiders;

import com.UstGlobal.Studentapp.jspiders.Remote;
//import static com.UstGlobal.Studentapp.jspiders.Remote.num;

public class TestB {
	
	public static void main(String[] args) {
		
		Remote.on();
		Remote.off();
		Remote.num = 12;
		System.out.println(Remote.num);
		
	}

}
