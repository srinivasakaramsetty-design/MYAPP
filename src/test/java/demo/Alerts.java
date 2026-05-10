package demo;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement alertButton = driver.findElement(By.id("alertButton"));

		// 🔥 Scroll
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", alertButton);

		// 🔥 Click
		wait.until(ExpectedConditions.elementToBeClickable(alertButton)).click();

		Thread.sleep(5000);

		Alert al = driver.switchTo().alert(); // debug

		System.out.println(al.getText());

		al.accept();

		// timerAlertButton

		WebElement alert = driver.findElement(By.id("timerAlertButton"));
		wait.until(ExpectedConditions.elementToBeClickable(alert)).click();

		Thread.sleep(5000);

		Alert al2 = driver.switchTo().alert(); // debug

		System.out.println(al2.getText());


		Thread.sleep(5000);

		al2.accept();

		// confirmButton

		WebElement confirmButton = driver.findElement(By.id("confirmButton"));

		wait.until(ExpectedConditions.elementToBeClickable(confirmButton)).click();

		Thread.sleep(5000);

		Alert al3 = driver.switchTo().alert(); // debug

		System.out.println(al3.getText());

		Thread.sleep(5000);

		al3.dismiss();

		// promtButton

		WebElement promtButton = driver.findElement(By.id("promtButton"));

		wait.until(ExpectedConditions.elementToBeClickable(promtButton)).click();
		

		Thread.sleep(5000);

		Alert al4 = driver.switchTo().alert(); // debug

		
		Thread.sleep(5000);

		al4.sendKeys("Hello");

		Thread.sleep(5000);

		al4.accept();

		driver.quit();
	}
}