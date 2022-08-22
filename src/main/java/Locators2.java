import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import java.time.Duration;

public class Locators2 {

    public static void main (String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver ();
        driver.manage().window().maximize(); // maximize the browser window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/"); // visit url

        System.out.println(driver.getTitle()); // check title
        System.out.println(driver.getCurrentUrl()); // validate homepage is opened or not
        Thread.sleep(1000);
        driver.findElement(By.id("inputUsername")).sendKeys("semih");
        driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");//rahulshettyacademy
        Thread.sleep(1000);
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText(),"You are successfully logged in.");
        driver.findElement(By.xpath("//button[normalize-space()='Log Out']")).click();
        driver.close();

    }

}
