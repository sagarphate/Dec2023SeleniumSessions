package waitConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumPractice.ElementException;
import seleniumPractice.TimeUtility;

public class CustomeWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");

		By eleLocator = By.name("username11");
		//retryingElement(eleLocator, 10).sendKeys("SAGAR");
		retryingElement(eleLocator, 10, 2);
	}

	public static WebElement retryingElement(By locator, int timeOut) {
		WebElement element = null;
		int attempts = 0;
		while (attempts < timeOut) {
			try{
				element = driver.findElement(locator);
				System.out.println("Element is found in attempt : " + attempts);
				break;
			}
			catch (NoSuchElementException e) {
				System.out.println("Element is NOT found in attempt :" + attempts);
				TimeUtility.defaultTime();
			}	
			attempts++;	
		}
		if(element == null) {
			System.out.println("Element Is NOT Found Try For "+ timeOut +" times "+ " With Interval Time Of " + 500 + " MilliSeconds" );
			throw new ElementException("No Such Element");
		}	
		return element;
	}
	
	
	public static WebElement retryingElement(By locator, int timeOut, int intervalTime) {
		WebElement element = null;
		int attempts = 0;
		while (attempts < timeOut) {
			try{
				element = driver.findElement(locator);
				System.out.println("Element is found in attempt : " + attempts);
				break;
			}
			catch (NoSuchElementException e) {
				System.out.println("Element is NOT found in attempt :" + attempts);
				TimeUtility.applyWait(intervalTime);
			}	
			attempts++;	
		}
		if(element == null) {
			System.out.println("Element Is NOT Found Try For "+ timeOut +" times "+ " With Interval Time Of " + intervalTime + " Seconds" );
			throw new ElementException("No Such Element");
		}	
		return element;
	}

}
