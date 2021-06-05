package com.amish.junit.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) throws ClassNotFoundException {
	   String[] clsname = new String[]{"com.amish.junit.test.TestJunit"};
	   Class[] cls = new Class[clsname.length];
	   JUnitCore runner = new JUnitCore();
	   ExecutionListener listner = new ExecutionListener();
       runner.addListener(listner);
       for(int i=0; i<clsname.length;i++){
    	   cls[i] = Class.forName(clsname[i]);
       }
      Result result = runner.run(cls);
      System.err.println("listner======="+listner.getResultSet());
     /* for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());*/
   }
}  	
