package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class kEYBoard_Actions {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // 🔥 Wait & focus username field
        WebElement username = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))
        );
        username.click();  // IMPORTANT for focus

        Actions act = new Actions(driver);

        // 🔥 Keyboard actions (stable)
        act.sendKeys("standard_user")
           .sendKeys(Keys.TAB)
           .sendKeys("secret_sauce")
           .sendKeys(Keys.ENTER)
           .perform();

        // 🔥 Optional verification
        wait.until(ExpectedConditions.urlContains("inventory"));
        System.out.println("Login successful using keyboard actions");

        driver.quit();
    }
}