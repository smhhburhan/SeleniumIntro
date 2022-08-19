package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver ();

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); // visit url
		
		System.out.println(driver.getTitle()); // check title
		System.out.println(driver.getCurrentUrl()); // validate homepage is opened or not
		
		driver.findElement(By.id("inputUsername")).sendKeys("semih");
		//driver.findElement(By.name("inputPassword")).sendKeys("semih");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("semih");//rahulshettyacademy
		driver.findElement(By.className("signInBtn")).click();
		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//System.out.println(driver.findElement(By.className("error")).getText());
		//System.out.println(driver.findElement(By.cssSelector("p[class='error']")).getText());
		System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("sem");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("sem@sem.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("987654321");
	}

}
