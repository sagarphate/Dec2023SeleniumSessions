package windowHandlesConcept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowHandel {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		String windowId =  driver.getWindowHandle();
		System.out.println(windowId);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//a[@title='Shopping Cart']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(ele).keyDown(Keys.CONTROL).click(ele).build().perform();
		
		//1. Fetch the Window Ids 
		Set<String> idDetails = driver.getWindowHandles();
		Iterator<String> allIds = idDetails.iterator();
		
	 	String parentWindowId = allIds.next();	
	 	String childWindowId = allIds.next();	
	 	
	 	System.out.println("parentWindowId = "+parentWindowId);
	 	System.out.println("childWindowId = "+childWindowId);
	 	
	 	//2nd Switch to window
	 	driver.switchTo().window(childWindowId);
	 	System.out.println("Title of the child Window = "+driver.getTitle());
	 	System.out.println("URL of the child Window = "+driver.getCurrentUrl());
	 	driver.close();
	 	
	 	driver.switchTo().window(parentWindowId);
	 	System.out.println("Title of the parent Window = "+driver.getTitle());
	 	System.out.println("URL of the parent Window = "+driver.getCurrentUrl());
	 
	 	driver.quit();
	 	//OR
	 //	driver.close();
	}

}
