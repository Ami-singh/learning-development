package com.amish.junit.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class ExecutionListener extends RunListener
{
	String testCase = null;
	Map<String,String> failedTestCase = null;
    /**
     * Called before any tests have been run.
     * */
    public void testRunStarted(Description description) throws java.lang.Exception
    {
        System.out.println("Number of tests to execute : " + description.testCount());
    }
 
    /**
     *  Called when all tests have finished
     * */
    public void testRunFinished(Result result) throws java.lang.Exception
    {
        System.out.println("Number of tests executed : " + result.getRunCount());
    }
 
    /**
     *  Called when an atomic test is about to be started.
     * */
    public void testStarted(Description description) throws java.lang.Exception
    {
        System.out.println("Starting execution of test case : "+ description.getMethodName());
        testCase = description.getMethodName();
    }
 
    /**
     *  Called when an atomic test has finished, whether the test succeeds or fails.
     * */
    public void testFinished(Description description) throws java.lang.Exception
    {
        System.out.println("Finished execution of test case : "+ description.getMethodName());
        if(!failedTestCase.containsKey(description.getMethodName()))
        	failedTestCase.put(description.getMethodName(), "Pass");
    }
 
    /**
     *  Called when an atomic test fails.
     * */
    public void testFailure(Failure failure) throws java.lang.Exception
    {
    	failedTestCase = new HashMap<>();
        System.out.println("Execution of test case failed : "+ failure.getDescription().getMethodName());
        if(testCase.equalsIgnoreCase(failure.getDescription().getMethodName()))
        	failedTestCase.put(failure.getDescription().getMethodName(), failure.getMessage());
    }
 
    /**
     *  Called when a test will not be run, generally because a test method is annotated with Ignore.
     * */
    public void testIgnored(Description description) throws java.lang.Exception
    {
        //System.out.println("Execution of test case ignored : "+ description.getMethodName());
    }
    
    public Map<String,String> getResultSet(){
    	return failedTestCase;
    }
}
