package demo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Xpath 
{

	public WebDriver driver;
	public WebDriverWait wait;
	public String url = "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC";

	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	}

	@Test
	public void loginTest() 
	{

		By user = By.name("username");
		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(user)
				);

		element.sendKeys("john");


		By pass = By.name("password");
		WebElement p = wait.until(
				ExpectedConditions.visibilityOfElementLocated(pass)
				);

		p.sendKeys("demo");


		By login = By.xpath("//input[contains(@value,'Log In')]");
		WebElement l = wait.until(
				ExpectedConditions.elementToBeClickable(login)
				);

		l.click();



		By message = By.xpath("//p[@class='smallText']");

		WebElement ele = wait.until(
				ExpectedConditions.visibilityOfElementLocated(message)
				);

		String text = ele.getText();
		System.out.println("Actual Text: " + text);

		if(text.contains("John"))
		{
			System.out.println("Login Successful");
		} 
		else
		{
			System.out.println("Login Failed");
		}

		//a[text()='Log Out']

		By Logout = By.xpath("//a[contains(@href,'logout')]");

		WebElement logoutBtn = wait.until(
		        ExpectedConditions.elementToBeClickable(Logout)
		);

		logoutBtn.click();

	}



	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
