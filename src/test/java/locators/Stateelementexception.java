package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stateelementexception 
{

	public static void main(String[] args) 
	{

		// This exception is thrown when the element is not found in the DOM.

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		WebElement checkbox = driver.findElement(By.cssSelector("#checkbox"));
		 driver.findElement(By.xpath("//button[text()='Remove']")).click();
		 checkbox.click();

	}


}
