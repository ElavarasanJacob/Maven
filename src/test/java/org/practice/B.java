package org.practice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class B {

	@BeforeClass
	public static void tc01() {
		System.out.println("method 1");
	}
	@Before
	public void tc02() {
		System.out.println("method 2");
	}
	@Test
	public void tc03() {
		System.out.println("method 3");
	}
	@Test
	public void tc04() {
		System.out.println("method dfdf4");
	}
	@After
	public void tc06() {
		System.out.println("method 7");

	}
	@AfterClass
	public static void tc05() {
		System.out.println("method 5");

	}

}
