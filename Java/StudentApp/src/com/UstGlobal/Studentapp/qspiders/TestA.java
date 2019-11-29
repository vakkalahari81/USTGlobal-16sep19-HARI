package com.UstGlobal.Studentapp.qspiders;

import com.UstGlobal.Studentapp.jspiders.Angular;
import com.UstGlobal.Studentapp.jspiders.Reactive;
import com.UstGlobal.Studentapp.jspiders.Remote;
//import com.UstGlobal.Studentapp.jspiders.*;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QTP q = new QTP();
		q.teachQtp();
		Selenium s =new Selenium();
		s.teachSelenism();
		
		// by using fully Qualified Name
		//com.UstGlobal.Studentapp.jspiders.Angular a =new com.UstGlobal.Studentapp.jspiders.Angular();
		
		
		//by using fully Qualified Name
		//com.UstGlobal.Studentapp.jspiders.Reactive  r = new com.UstGlobal.Studentapp.jspiders.Reactive();
		
		Angular a =new Angular();
		a.teachAngular(); 
		
		Reactive  r = new Reactive();
		r.teachReactive();
		
		Remote.on();
	}
}
