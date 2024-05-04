package ActionClassANDAlertInterfaceConcept;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		Actions act = new Actions(driver);
	
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1500);
//		act.sendKeys(Keys.PAGE_UP).perform();
		
		//Page Scroll down and up-Home 
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
//	
	
	
		WebElement element = driver.findElement(By.xpath("//h5[text()='Terms & Conditions']"));
		Thread.sleep(3000);
		// Scroll to the Element
		act.scrollToElement(element).click(element).build().perform();
		
		
	}

}
