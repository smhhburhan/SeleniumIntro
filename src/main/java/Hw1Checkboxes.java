import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Hw1Checkboxes {

    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

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
