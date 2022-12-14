package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Driver;

public class e2e extends Driver {

    public static void main(String[] args) throws InterruptedException {


        //System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver","./drivers/geckodriver"); // macOS
        //WebDriver driver = new FirefoxDriver();
        //driver.manage().window().maximize();

        startDriver("");
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
        Thread.sleep(1000);

        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){

            System.out.println("its disabled");
            Assert.assertTrue(true);

        }
        else{

            Assert.assertTrue(false);

        }

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);

        for(int i=1;i<5;i++){

            driver.findElement(By.id("hrefIncAdt")).click();

        }

        Thread.sleep(1000);

        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();

    }

}