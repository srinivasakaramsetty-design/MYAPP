package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations 
{

	@BeforeSuite
	public void beforeSuite() 
	{
		System.out.println("Before Suite - Setup reports/database");
	}

	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("Before Class - Launch Browser");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method - Login");
	}

	@Test
	public void c()
	{
		System.out.println("Test Case 1 - Search Product");
	}

	@Test
	public void a() 
	{
		System.out.println("Test Case 2 - Add to Cart");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method - Logout");
	}
	
	@AfterClass
    public void afterClass()
    {
        System.out.println("After Class - Close Browser");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("After Suite - Close Reports");
    }

}
