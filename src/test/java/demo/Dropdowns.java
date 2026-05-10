package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		Thread.sleep(5000);
		
		Select select = new Select(dropdown);
		select.selectByVisibleText("Option 1");
		
		Thread.sleep(5000);
		
		driver.quit();
		

	}

}
