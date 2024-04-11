package javapackage;

import org.testng.annotations.Test;

	public class TestNGPriority {

	@Test (priority = -1)
	
	public void a()
	{
		System.out.println("hello TestNg a");	
	}
	
	@Test (priority = 2)
	
	public void b()
	{
		System.out.println("hello TestNg b");	
	}

	@Test (priority = 0)

	public void c()
    {
	System.out.println("hello TestNg c");
    }

    @Test (priority = 1)

    public void d()
    {
	System.out.println("hello TestNg d");	
    }

}
