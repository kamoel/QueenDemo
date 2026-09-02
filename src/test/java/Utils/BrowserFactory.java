package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory {

    public static WebDriver launchBrowser(String browserChoice, String url) {
        WebDriver driver;

        switch (browserChoice.toLowerCase()) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless=new",
                        "--no-sandbox", "--disable-dev-shm-usage", "--window-size=1920,1080"
                );
                driver = new ChromeDriver(chromeOptions);
                break;
            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--headless=new",
                        "--no-sandbox", "--disable-dev-shm-usage", "--window-size=1920,1080"
                );
                driver = new EdgeDriver(edgeOptions);
                break;
            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("-headless");
                driver = new FirefoxDriver(firefoxOptions);
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browserChoice);
        }

        try {
            driver.manage().window().maximize();
            driver.get(url);
            return driver;
        } catch (RuntimeException exception) {
            driver.quit();
            throw exception;
        }
    }
}
