package com.home.CoolAI;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class AppTest
{


	@Test
	public void  Test009 ()
	{
		System.out.println("Test 1");;
	}

	@Test
	public void  Test001 ()
	{
		System.out.println("Test 2");
	}

	@Test
	public void testApp()
	{
		assertTrue( true );
		System.out.println("Test 3");

	}
	
	@Test
	public void testRuntimearg() {
		String runTimeArg = System.getProperty("runtimearg");
		System.out.println(runTimeArg);
	}
}
