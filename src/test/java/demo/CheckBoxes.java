package demo;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class CheckBoxes 
{

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// 🔥 Click Expand All
		WebElement checkbox1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='checkboxes']/input[1]")));

		checkbox1.click();

		System.out.println("Checkbox selected successfully");

		WebElement checkbox2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='checkboxes']/input[2]")));

		if (checkbox2.isSelected())
		{
			System.out.println("Checkbox 2 is already selected");
		} 
		else
		{
			checkbox2.click();
			System.out.println("Checkbox 2 selected successfully");
		}

		driver.quit();
	}
}