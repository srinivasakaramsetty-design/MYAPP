package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames 
{

	public static void main(String[] args)
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		// 🔥 Switch to first frame (index)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		// 🔥 Switch to first frame (index)
        driver.switchTo().frame("singleframe");

		
		WebElement image = wait.until(
	            ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[1]"))
	        );
	        image.sendKeys("Hello Frame!");

	        
	        driver.switchTo().defaultContent(); // Switch back to main content
	        
	        driver.quit();
	        
	        
		
		
	}

}
