package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NosuchelementException 
{
public static void main(String[] args) 
{
	
	// This exception is thrown when the element is not found in the DOM.
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demoblaze.com/");
	driver.findElement(By.id("nonExistingElement")).sendKeys("Hello");
	
}
}
