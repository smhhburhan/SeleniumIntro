package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {
	
	public static void main (String[] args) {
		
		// invoking Browser
		// invoking Browser
				// Firefox - FirefoxDriver -> Methods close get ..
				// WebDriver methods (has own empty body  methods) + class methods (chromerDriver has own class methods)
				
				// geckodriver.exe -> Firefox browser
				// webdriver.gecko.deriver -> value of path
				//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
						
				//WebDriver driver = new FirefoxDriver ();
				//driver.get("https://rahulshettyacademy.com/"); // visit url
				//System.out.println(driver.getTitle()); // check title
				//System.out.println(driver.getCurrentUrl()); // validate homepage is opened or not
		
		// Chrome - ChromeDriver -> Methods close get ..
		// WebDriver methods (has own empty body  methods) + class methods (chromerDriver has own class methods)
		
		// chromedriver.exe -> Chrome browser
		// webdriver.chrome.deriver -> value of path
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// ChromeDriver driver = new ChromeDriver ();
		WebDriver driver = new ChromeDriver ();
		driver.get("https://rahulshettyacademy.com/"); // visit url
		
		System.out.println(driver.getTitle()); // check title
		System.out.println(driver.getCurrentUrl()); // validate homepage is opened or not
		
		
		
		
		//driver.close();
	}

}
