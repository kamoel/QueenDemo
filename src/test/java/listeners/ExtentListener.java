package listeners;



import Basics.loginToNdosiWebsite;
import Utils.screenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.*;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;

public class ExtentListener implements ITestListener {

    private static ExtentReports extent = ExtentManager.getInstance();

    private static Map<Long, ExtentTest> tests = new HashMap<>();

    @Override
    public void onTestStart(ITestResult result) {

        ExtentTest test = extent.createTest(result.getMethod().getMethodName());
        tests.put(Thread.currentThread().getId(), test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        tests.get(Thread.currentThread().getId()).pass("Test Passed");
    }

//    @Override
//    public void onTestFailure(ITestResult result) {
//
//        try {
//
//            //WebDriver driver = DriverManager.getDriver(); // if you have one
//            WebDriver driver = loginToNdosiWebsite.driver;
//
//            String screenshotPath = screenshot.capture(
//                    driver,
//                    result.getMethod().getMethodName());
//
//            tests.get(Thread.currentThread().getId())
//                    .fail(result.getThrowable())
//                    .addScreenCaptureFromPath(screenshotPath);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    @Override
    public void onTestSkipped(ITestResult result) {

        tests.get(Thread.currentThread().getId())
                .skip("Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();
    }
}