package Tests;

import Basics.loginToNdosiWebsite;
import Pages.Purchase_Phone;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Utils.screenshot;
import listeners.ExtentManager;
import listeners.ExtentListener;


@Listeners({
        ExtentListener.class
})
public class Purchase_Phone_TestCases {
    @BeforeMethod
    public void open() throws Throwable {
        loginToNdosiWebsite.login("https://www.ndosiautomation.co.za/");
    }

    @AfterMethod
    public void closebrw1(ITestResult result) throws Throwable {
//
//        if (result.getStatus() == ITestResult.FAILURE) {
//            screenshot.takeScreenshot(
//                    loginToNdosiWebsite.driver,
//                    result.getMethod().getMethodName());
//        }

        loginToNdosiWebsite.quit();
    }

    @Test(priority = 1)
    public static void purchasePhone() throws Throwable {
        Purchase_Phone.purchasePhone();
    }
}

