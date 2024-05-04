package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElementClickSendKeys {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		// If any button and text filed is disabled then on click selenium its not give any error / Exception
		//driver.findElement(By.id("pass")).click();
	
		// text filed is disabled then and on send keys it give -- ElementNotInteractableException: element not interactable
		//driver.findElement(By.id("pass")).sendKeys("sagar");
		
		// any text filed if we pass the value as null not in double code then it give Exception as :
		// IllegalArgumentException: Keys to send should be a not null CharSequence
		driver.findElement(By.id("fname")).sendKeys(null);
		
		
	
	}
}
