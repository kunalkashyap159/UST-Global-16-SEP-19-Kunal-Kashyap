package com.ustglobal.studentapp.qspiders;
//  Second option write the import statement.......

//import com.ustglobal.studentapp.jspiders.Angular;
//import com.ustglobal.studentapp.jspiders.React;

import com.ustglobal.studentapp.jspiders.*;

public class TeastA {

	public static void main(String[] args) {
		
		QTP q = new QTP();
		q.teachQTP();
		
		Selenium s = new Selenium();
		s.teachSelenium();
		
		//One option do fully qualified class name......
		
	//	com.ustglobal.studentapp.jspiders.Angular a = 
	//			new com.ustglobal.studentapp.jspiders.Angular();
		
	//	com.ustglobal.studentapp.jspiders.Angular b = 
	//			new com.ustglobal.studentapp.jspiders.Angular();
		
		Angular a = new Angular();
		a.teachAngular();
		
		React r = new React();
		r.teachReact();
		
	}

}
