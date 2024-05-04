package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");

		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("SAGARPHATE@GMAIL.COM");
		
		driver.navigate().refresh();
		
		// to fix these issue do initialize the element
		userName = driver.findElement(By.name("username")); //
		userName.sendKeys("sagarphate@gmail.com"); // StaleElementReferenceException: stale element reference: stale element not found
	}

}
