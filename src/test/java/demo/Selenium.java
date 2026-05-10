package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		String text = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.name("login-button")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Logout")).click();
		
		
		

	}

}
