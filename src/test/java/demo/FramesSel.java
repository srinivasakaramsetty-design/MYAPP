package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesSel {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Switch to frame
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frm1"));

        // Locate dropdown
        WebElement dropdown = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("course")));

        // Scroll down slowly to dropdown when application opens
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView({behavior:'smooth', block:'center'});", dropdown);

        Thread.sleep(2000);

        // Click dropdown
        dropdown.click();

        // Select value
        dropdown.sendKeys("Java");

        driver.quit();
    }
}