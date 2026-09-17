package Pages;

import Basics.loginToNdosiWebsite;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Web_Automation_AdvancePage {

    public static void Web_automation_AdvancePage() {
        WebDriver self = loginToNdosiWebsite.driver;
        WebDriverWait wait = new WebDriverWait(self, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Web Automation Advance']")));
        self.findElement(By.xpath("//*[text()='Web Automation Advance']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("deviceType")));
        self.findElement(By.id("deviceType")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='deviceType']/option[@value='phone']")));
        self.findElement(By.xpath("//select[@id='deviceType']/option[@value='phone']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("brand")));
        self.findElement(By.id("brand")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='brand']/option[@value='apple']")));
        self.findElement(By.xpath("//select[@id='brand']/option[@value='apple']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("storage-128GB")));
        self.findElement(By.id("storage-128GB")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("color")));
        self.findElement(By.id("color")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='color']/option[@value='blue']")));
        self.findElement(By.xpath("//select[@id='color']/option[@value='blue']")).click();


        wait.until(ExpectedConditions.elementToBeClickable(By.id("quantity")));
        self.findElement(By.id("quantity")).sendKeys("2");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("address")));
        self.findElement(By.id("address")).sendKeys("&quot;123 Test Street&quot");


        wait.until(ExpectedConditions.elementToBeClickable(By.id("inventory-next-btn")));
        self.findElement(By.id("inventory-next-btn")).click();





    }

    public static void Inventory_Form_Requirements() throws InterruptedException {
        WebDriver self = loginToNdosiWebsite.driver;
        JavascriptExecutor jvr = (JavascriptExecutor) self;
        WebDriverWait wait = new WebDriverWait(self, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("shipping-option-express")));
        self.findElement(By.id("shipping-option-express")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("warranty-2yr")));
        self.findElement(By.id("warranty-2yr")).click();


        WebElement purchase = self.findElement(By.id("purchase-device-btn"));
        jvr.executeScript("arguments[0].scrollIntoView()", purchase);
        purchase.click();
        Thread.sleep(3000);
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("view-history-btn")));
        self.findElement(By.id("view-history-btn")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@id,'view-invoice') and contains(.,'View')]")));
        self.findElement(By.xpath("//button[contains(@id,'view-invoice') and contains(.,'View')]")).click();



    }
}


