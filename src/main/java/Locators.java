import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver ();

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize(); // maximize the browser window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); // visit url
		
		System.out.println(driver.getTitle()); // check title
		System.out.println(driver.getCurrentUrl()); // validate homepage is opened or not
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("semih");
		//driver.findElement(By.name("inputPassword")).sendKeys("semih");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("semih");//rahulshettyacademy
		Thread.sleep(1000);
		driver.findElement(By.className("signInBtn")).click();
		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//System.out.println(driver.findElement(By.className("error")).getText());
		//System.out.println(driver.findElement(By.cssSelector("p[class='error']")).getText());
		System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("sem");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("sem@sem.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("123456789");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("987654321");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		driver.findElement(By.xpath("//button[normalize-space()='Go to Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("semih");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");//rahulshettyacademy
		driver.findElement(By.id("chkboxOne")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		System.out.println(driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText());

	}

}
