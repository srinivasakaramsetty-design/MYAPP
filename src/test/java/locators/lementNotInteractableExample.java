package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lementNotInteractableExample
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        // Example: trying to click hidden/disabled element
        driver.findElement(By.id("logout2")).click();
	}

}
