package Pages;

import Basics.loginToNdosiWebsite;
import org.openqa.selenium.WebDriver;
import Pages.learnPage;

public class Purchase_Phone extends loginToNdosiWebsite {
    WebDriver self = loginToNdosiWebsite.driver;
public static void purchasePhone() throws InterruptedException {
    //LearnPage learnPageO = new LearnPage();
    //WebDriver self = loginToNdosiWebsite.driver;
    //learnPage earnPage = new learnPage();
    learnPage.learnpage();
    Web_Automation_AdvancePage.Web_automation_AdvancePage();
    Web_Automation_AdvancePage.Inventory_Form_Requirements();
   }
}
