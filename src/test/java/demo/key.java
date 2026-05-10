package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class key {

	public static void main(String[] args) throws InterruptedException 
	{
		    WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com/");
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.name("q")).sendKeys("Selenium");
	        
	        Thread.sleep(5000);
	        
	        Actions act = new Actions(driver);
	        act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
	        
	        driver.quit();
	        
	        
	}

}
