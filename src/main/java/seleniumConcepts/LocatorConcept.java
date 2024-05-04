package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumPractice.ElementUtil;

public class LocatorConcept {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// 1. Approach
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
//		
//		// 2. Approach = Maintaining web element and when required perform action it
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		emailId.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");
		
		// 3. Approach - By Locator
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//	
//	 	WebElement emailId =  driver.findElement(username);
//		WebElement password = driver.findElement(pwd);
//		
//		emailId.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");
		
		// 4. Approach - By Locator with some Utility
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement emailID = getElement(username); // getElement Utility created for find address
//		WebElement password = getElement(pwd); // getElement Utility created for find address
//		
//		emailID.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");
		
		
		// 5. Approach - By Locator with Element Utility method + Action Utility method
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		doSendKeys(username, "test@gmail.com");
//		doSendKeys(pwd, "test@123");

		// 6. Approach - By Locator with Element Utility class - Utility class have find element and action methods
		By username = By.id("input-email");
		By pwd = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(username, "test@gmail.com");
		eleUtil.doSendKeys(pwd, "test@123");
		
		
		// 7. Approach - By Locator with in caller class and combine Element Utility and Browser Utility 
		// TestElementUtilBrowserUtil in these class
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
}
