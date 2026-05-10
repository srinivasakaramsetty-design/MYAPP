package demo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login 
{

	public WebDriver driver;
	public String url = "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC";

	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@Test
	public void loginTest() 
	{
		driver.findElement(By.name("username")).sendKeys("john");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		WebElement ele= driver.findElement(By.xpath("//p[@class='smallText']"));

		String text = ele.getText();
		System.out.println("Actual Text: " + text);

		if(ele.getText().contains("John"))
		{
			System.out.println("Login Successful");
		} 
		else
		{
			System.out.println("Login Failed");
		}


		// web table 

		List<WebElement> headers =
				driver.findElements(By.xpath("//table[@id='accountTable']//th"));

		List<String> textList = new ArrayList<>();

		for (WebElement header : headers)
		{
			textList.add(header.getText());
		}

		System.out.println(String.join(" | ", textList));

		List<WebElement> cols = driver.findElements(
				By.xpath("//table[@id='accountTable']/tbody/tr[1]/td")
				);

		System.out.println("Column size: " + cols.size());

		for (WebElement col : cols) {
			System.out.print(col.getText() + " | ");
		}

		driver.findElement(By.linkText("Log Out")).click();
	}



	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
