package Pages;

import Basics.loginToNdosiWebsite;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Web_Automation_AdvancePage {

    public static void Web_automation_AdvancePage() {
        WebDriver self = loginToNdosiWebsite.driver;
        WebDriverWait wait = new WebDriverWait(self, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Web Automation Advance']")));
        self.findElement(By.xpath("(//*[text()='Web Automation Advance']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("deviceType")));
        self.findElement(By.id("deviceType")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Phone']")));
        self.findElement(By.xpath("(//*[text()='Phone']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("brand")));
        self.findElement(By.id("brand")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Apple'][1])")));
        self.findElement(By.xpath("(//*[text()='Apple'][1]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("storage-64GB")));
        self.findElement(By.id("storage-64GB")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("(color")));
        self.findElement(By.xpath("(color")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Black']")));
        self.findElement(By.xpath("//*[text()='Black']")).click();


        wait.until(ExpectedConditions.elementToBeClickable(By.id("(quantity")));
        self.findElement(By.id("(quantity")).sendKeys("1");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("address")));
        self.findElement(By.id("address")).sendKeys("Kamoelqueen@gmail.com");


        wait.until(ExpectedConditions.elementToBeClickable(By.id("(inventory-next-btn")));
        self.findElement(By.id("(inventory-next-btn")).click();





    }

    public static void Inventory_Form_Requirements() {
        WebDriver self = loginToNdosiWebsite.driver;
        JavascriptExecutor jvr = (JavascriptExecutor) self;
        WebDriverWait wait = new WebDriverWait(self, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("(shipping-express")));
        self.findElement(By.id("(shipping-express")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("warranty-2yr")));
        self.findElement(By.id("warranty-2yr")).click();


        WebElement purchase = self.findElement(By.id("purchase-device-btn"));
        jvr.executeScript("arguments[0].scrollIntoView()", purchase);


        wait.until(ExpectedConditions.elementToBeClickable(By.id("(view-history-btn")));
        self.findElement(By.xpath("(view-history-btn")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Black']")));
        self.findElement(By.xpath("//*[text()='Black']")).click();



    }
}


