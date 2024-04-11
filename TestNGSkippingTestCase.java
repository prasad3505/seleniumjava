package javapackage;

import org.testng.annotations.Test;

public class TestNGSkippingTestCase {
	

	@Test 
	public void a()
	{
		System.out.println("hello TestNg a");	
	}
	@Test (enabled = false)             // This Test case is skipped
	public void b()
	{
		System.out.println("hello TestNg b");	
	}

	@Test (enabled = true)              //Same execution as a method
	public void c()
	{
		System.out.println("hello TestNg c");	
	}

	@Test (invocationCount = 4)               // Used for repeat execution of test case
	public void d()
	{
		System.out.println("hello TestNg d");	
	}


}
