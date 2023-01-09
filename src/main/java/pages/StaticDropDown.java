package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Driver;

public class StaticDropDown extends Driver {

    public static void main (String[] args){

        //System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver","./drivers/geckodriver"); // macOS
        //WebDriver driver = new FirefoxDriver();
        //driver.manage().window().maximize();

        startDriver("");

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //System.out.println(driver.findElement(By.xpath("//option[normalize-space()='USD']")).getText());

        //dropdown with select tag
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());

    }

}