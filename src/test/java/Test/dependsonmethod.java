package Test;

import org.testng.annotations.Test;

public class dependsonmethod
{
	@Test
	public void test1() 
	{
		System.out.println("This is test 1");
	}

	@Test(dependsOnMethods = "test1")
	public void test2()
	{
		System.out.println("This is test 2");
	}

}
