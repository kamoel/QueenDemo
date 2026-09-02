package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginToNdosiWebsite {

    WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
    }


    @Test
    public void clickLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
    }

    @Test(dependsOnMethods = {"clickLoginButton"})
    public void enterUserName() throws InterruptedException {
        driver.findElement(By.id("login-email")).sendKeys("Kamoelqueengmail.com");
    }

    @Test(dependsOnMethods = {"enterUserName"})
    public void enterPassword() throws InterruptedException {
        driver.findElement(By.id("login-password")).sendKeys("@12345678");
    }

    @Test(dependsOnMethods = {"enterPassword"})
    public void clickLoginSubmitButton() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = {"clickLoginSubmitButton"})
    public void verifyLoginSuccess() {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[3]/button/span[2]")).isDisplayed();
    }

    @AfterTest
    public void quit() {
        driver.quit();
    }
}

