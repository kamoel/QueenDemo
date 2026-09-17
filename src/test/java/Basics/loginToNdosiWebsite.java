package Basics;

import Utils.screenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginToNdosiWebsite {

   public static WebDriver driver;

    public static void login(String login) throws Exception {
        driver = new EdgeDriver();
        driver.get(login);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        screenshot.capture(driver);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Login']")));
        driver.findElement(By.xpath("//*[text()='Login']")).click();
        screenshot.capture(driver);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-email")));
        driver.findElement(By.id("login-email")).sendKeys("Kamoelqueen@gmail.com");
        screenshot.capture(driver);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-password")));
        driver.findElement(By.id("login-password")).sendKeys("@12345678");
        screenshot.capture(driver);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-submit")));
        driver.findElement(By.id("login-submit")).click();

    }


    public static void quit() {
        driver.quit();
    }
}

