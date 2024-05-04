package ActionClassANDAlertInterfaceConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {

	static WebDriver driver;
	public static Actions act;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By userEmail =By.id("input-email");
		By password = By.id("input-password");
		By login = By.xpath("//input[@type='submit']");
		
		
//		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(userEmail), "sagar@gmail.com").perform();
//		act.sendKeys(driver.findElement(password), "test123").perform();
//		act.sendKeys(driver.findElement(login)).perform();
			
		doActionsSendKeys(userEmail, "test@gmail.com");
		doActionsSendKeys(password, "test@12321");
		doActionsClick(login);
	}

	public static WebElement getElement(By locator) {
	    return driver.findElement(locator);
	}
	
	
	public static void doActionsSendKeys(By locator, String value) {
		
		act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
		
	}
	
	public static void doActionsClick(By locator) {
		
		act = new Actions(driver);
		act.sendKeys(getElement(locator)).perform();
	}
}
