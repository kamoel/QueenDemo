package Tests;

import Pages.HomePage;
import Pages.LandingPage;
import Pages.LoginPage;
import Utils.BrowserFactory;
import Utils.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class base {
        protected WebDriver driver;
        protected HomePage homePage;
        protected LoginPage loginPage;
        protected LandingPage landingPage;
        protected final TakesScreenshots takesScreenshots = new TakesScreenshots();

        @BeforeClass
        public void setUp() {
            String browser = System.getProperty("browser", "edge");
            String url = System.getProperty(
                    "baseUrl",
                    "https://ndosisimplifiedautomation.vercel.app/"
            );

            driver = BrowserFactory.launchBrowser(browser, url);
            homePage = PageFactory.initElements(driver, HomePage.class);
            loginPage = PageFactory.initElements(driver, LoginPage.class);
            landingPage = PageFactory.initElements(driver, LandingPage.class);
        }

        @AfterClass(alwaysRun = true)
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }


