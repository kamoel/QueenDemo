package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class loginToNdosiWebsite {

   public static WebDriver driver;

    public static void login(String login) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(login);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Login']")));
        driver.findElement(By.xpath("//*[text()='Login']")).click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-email")));
        driver.findElement(By.id("login-email")).sendKeys("Kamoelqueen@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-password")));
        driver.findElement(By.id("login-password")).sendKeys("@12345678");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-submit")));
        driver.findElement(By.id("login-submit")).click();

    }


    public static void quit() {
        driver.quit();
    }
}

