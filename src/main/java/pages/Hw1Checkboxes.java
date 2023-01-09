package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Driver;

public class Hw1Checkboxes extends Driver {

    public static void main (String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver","./drivers/geckodriver"); // macOS
        //WebDriver driver = new FirefoxDriver();
        //driver.manage().window().maximize();

        startDriver("");

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
        Assert.assertFalse(driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());
        Thread.sleep(1000);

        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

    }

}