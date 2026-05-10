package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drag_Drop 
{

    public static void main(String[] args)
    {

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // 🔥 Wait and switch to iframe
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));

        // 🔥 Wait for elements
        WebElement source = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("draggable"))
        );

        WebElement target = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("droppable"))
        );

        // Actions
        Actions actions = new Actions(driver);

        actions.dragAndDrop(source, target).perform();

        System.out.println("Drag and Drop performed successfully");

        driver.quit();
    }
}