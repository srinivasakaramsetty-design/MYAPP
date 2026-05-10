package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();

		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent window id is " + parentwindow);

		driver.findElement(By.id("tabButton")).click();

		Set<String> allwindows = driver.getWindowHandles();

		for(String win : allwindows)
		{
			if(!win.equals(parentwindow))
			{
				driver.switchTo().window(win);

				System.out.println("Child Title: " + driver.getTitle());

				// Close child window
				driver.close();
			}
		}


		// Switch back to parent
		driver.switchTo().window(parentwindow);

		System.out.println("Parent Title: " + driver.getTitle());

		driver.quit();


	}
}