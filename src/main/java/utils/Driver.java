package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Parameters;
public class Driver {

    public static WebDriver driver;
    //public static ChromeOptions options;

    @BeforeSuite
    //@Parameters({"browserName"})
    public static void startDriver(String browserName) {

        if (browserName.equals("Chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }

        else if (browserName.equals("Firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }

        else {

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.setBinary("/Applications/Brave Browser.app/Contents/MacOS/Brave Browser");
            driver = new ChromeDriver(options);

        }

        driver.manage().window().maximize();

    }

    @AfterSuite
    public void endDriver() {

        driver.quit();

    }

}