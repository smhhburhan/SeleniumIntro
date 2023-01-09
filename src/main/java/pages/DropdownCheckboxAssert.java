package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Driver;

public class DropdownCheckboxAssert extends Driver {

    public static void main (String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver","./drivers/geckodriver"); // macOS
        //WebDriver driver = new FirefoxDriver();
        //driver.manage().window().maximize();

        startDriver("");
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        //Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        // count the number of check boxes
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        //driver.findElement(By.id("hrefIncAdt")).click(); // 2 adults

        /*int i=1;
        while(i<5){

        driver.findElement(By.id("hrefIncAdt")).click();
        i++;
        }*/

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        for(int i=1;i<5;i++){

            driver.findElement(By.id("hrefIncAdt")).click();

        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

    }

}