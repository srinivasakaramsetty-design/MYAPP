package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUplaod 
{

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		Thread.sleep(5000);

		WebElement choosefile = driver.findElement(By.id("file-upload"));
		
		Thread.sleep(5000);

		choosefile.sendKeys("D:\\Manual Testing");
		
		Thread.sleep(5000);

		driver.findElement(By.id("file-submit")).click();

	}

}
