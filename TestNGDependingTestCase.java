package javapackage;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;


public class TestNGDependingTestCase {
	
	@Test
	
	public void z()
	{
		AssertJUnit.assertTrue(3 > 12);
		System.out.println("hello Z Test case");
		
	}
	
	@Test (dependsOnMethods = "z")     //Used for depending test cases
	
	public void b()
	{
		
		System.out.println("Hello B Test Case");
	}
	
	

}
