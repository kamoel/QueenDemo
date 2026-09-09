package Pages;


import Basics.loginToNdosiWebsite;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Basics.loginToNdosiWebsite.driver;


public class learnPage {
   //public static WebDriver driver;

    public static void learnpage() {

        WebDriver self = loginToNdosiWebsite.driver;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Learn'])[1]"))).click();
        self.findElement(By.xpath("(//*[text()='Learn'])[1]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Learning Materials'])[1]"))).click();
        self.findElement(By.xpath("(//*[text()='Learning Materials'])[1]")).click();



    }

}
