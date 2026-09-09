package Tests;



import Basics.loginToNdosiWebsite;
import Pages.Purchase_Phone;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Purchase_Phone_TestCases {

    @BeforeMethod
    public void open() throws Throwable {
        loginToNdosiWebsite.login("https://www.ndosiautomation.co.za/");
    }
//    @AfterMethod
//    public void close() throws Throwable {
//        loginToNdosiWebsite.quit();
//    }

    @Test(priority = 1)
    public static void purchasePhone() throws Throwable {
        Purchase_Phone.purchasePhone();
    }}

