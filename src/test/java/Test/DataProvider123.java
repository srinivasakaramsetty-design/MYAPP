package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider123 
{

	   // data provider 
	
	

	    @DataProvider(name = "loginData")
	    public Object[][] getData() 
	    {
	        return new Object[][]
	        		{
	            {"standard_user", "secret_sauce"},
	            {"locked_out_user", "secret_sauce"},
	            {"problem_user", "secret_sauce"}
	        };
	    }

	    @Test(dataProvider = "loginData")
	    public void loginTest(String username, String password)
	    {

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.saucedemo.com/");

	        driver.findElement(By.id("user-name")).sendKeys(username);
	        driver.findElement(By.id("password")).sendKeys(password);
	        driver.findElement(By.id("login-button")).click();

	        System.out.println("Login attempted with: " + username);

	        driver.quit();
	    }
	}
	


