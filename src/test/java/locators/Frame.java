package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame 
{
	
public static void main(String[] args) 
{
	 WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/iframe");

    // ❌ wrong frame name
    driver.switchTo().frame("wrongFrame");
}


}
