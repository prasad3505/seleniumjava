package javapackage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

	public class TestNG1 {

	@Test 
	public void Test1()
	{
		System.out.println("hello Test Case 1");	
	} 
	
	@Test 
	public void Test2()
	{
		System.out.println("hello Test Case 2");	
	}
	
	@BeforeSuite
	public void Test3()
	{
		System.out.println("hello Test Case 3");	
	}
	
	
}
