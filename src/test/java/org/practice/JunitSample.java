package org.practice;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/* @RunWith(Suite.class)
@Suite.SuiteClasses({A.class,B.class}) */
public class JunitSample {

@Test
	public void test() {

Result r = JUnitCore.runClasses(A.class,B.class);


int failureCount = r.getFailureCount();
System.out.println(failureCount);

int runCount = r.getRunCount();
System.out.println(runCount);

long runTime = r.getRunTime();
System.out.println("mkkdskd" +runTime);

List<Failure> failures = r.getFailures();
for (Failure f : failures) {
	System.out.println(f);
	String message = f.getMessage();
	
	System.out.println(message);
	
	
}

boolean wasSuccessful = r.wasSuccessful();

System.out.println(wasSuccessful);





	
	
	} 
	
	
	
}
