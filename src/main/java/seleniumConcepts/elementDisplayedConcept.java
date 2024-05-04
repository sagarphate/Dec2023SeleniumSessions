package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementDisplayedConcept {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// with isDisplayed() method we try to validate the O/P and in these the provided locator is wrong
		// then it will give the Exception  as org.openqa.selenium.NoSuchElementException
		
		/**
		 * AVOID TO USE THESE isDisplay Method (If only one logo is present and that's not change then we can use)
		 */
//		boolean flag = driver.findElement(By.xpath("//img[@class='img-responsive']")).isDisplayed();
//		System.out.println(flag);
//		
//		if(flag) {
//			System.out.println("Logo is displayed");
//		}
//		else {
//			System.out.println("Logo is not displayed");
//		}
//		
//		By logo = By.xpath("//img[@class='img-responsive']");
//		if(isElementDisplayed(logo)) {
//			System.out.println("Logo is Display");
//		}
//		else {
//			System.out.println("Logo is NOT Display");
//		}
		
		
		// With help of driver.findElements - its not give any Exception when locator is wrong 
		// it give blank array list - size is Zero
		// applied below logic / approach When page has only single Element

//		List<WebElement> logo=  driver.findElements(By.xpath("//img[@class='img-responsive']"));
//		if(logo.size() ==1 ) {
//			System.out.println("Logo is Displayed"); 
//		}
//		else {
//			System.out.println("Logo is not Displayed");
//		}
		
		// if page have multiple logo's then 
		
		By logo = By.xpath("//img[@class='img-responsive']");
		
		boolean flag = isElementExist(logo);
		System.out.println(flag);
		
		if(flag == true) {
			System.out.println("Logo is Displayed");
		}else {
			System.out.println("Logo is NOT Displayed");
		}
	}
	
	public static boolean isElementExist(By locator) {
		List<WebElement> logo = getElements(locator);
		if(logo.size() == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static List<WebElement> getElements(By locator) {
		
		return driver.findElements(locator);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	// If not locator is wrong - before check the element is display or not it give the NoSuchElement Exception
	// Other way to create it / another function
	
	public static boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
}
