package Test;

import org.testng.annotations.Test;

public class grouping 
{

	@Test(groups = {"smoke"})
	public void testLogin() 
	{
		System.out.println("Login Test - Smoke");
	}

	@Test(groups = {"regression"})
	public void testSearch() 
	{
		System.out.println("Search Test - Regression");
	}

	@Test(groups = {"smoke", "regression"})
	public void testCheckout() 
	{
		System.out.println("Checkout Test - Smoke & Regression");
	}

}
