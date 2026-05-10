package locators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class TimeoutExample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Element takes more time than 3 sec
        WebElement finishText = wait.until(
            ExpectedConditions.elementToBeClickable(By.id("Start"))
        );

        finishText.click();
        
        System.out.println(finishText.getText());

        driver.quit();
    }
}