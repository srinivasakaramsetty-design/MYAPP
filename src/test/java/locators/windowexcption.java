package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowexcption 
{

	// This exception is thrown when the driver is not able to switch to the
	// specified window.
	
	public static void main(String[] args) 
	{

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        String invalidWindow = "12345";

        // ❌ switching to non-existing window
        driver.switchTo().window(invalidWindow);
    }

}
