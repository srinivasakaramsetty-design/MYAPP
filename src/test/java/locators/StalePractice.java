package locators;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class StalePractice {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        // Locate checkbox
        WebElement checkbox = driver.findElement(By.cssSelector("#checkbox"));

        // Click Remove (DOM changes)
        driver.findElement(By.xpath("//button[text()='Remove']")).click();

        // Try using old element → STALE
        checkbox.click(); // ❌ Exception
    }
}