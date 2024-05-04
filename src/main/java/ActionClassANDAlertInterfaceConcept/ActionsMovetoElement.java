package ActionClassANDAlertInterfaceConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMovetoElement {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
//		WebElement containtCss = driver.findElement(By.cssSelector("a.menulink"));
//		WebElement containtXpath = driver.findElement(By.xpath("//a[contains(text(),'Content')]"));
//		
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(containtCss).perform();
		
		By parentLocator = By.xpath("//a[contains(text(),'Content')]");
		By menuLocator = By.cssSelector("a.menulink");
		
		handleMenuSubMenu(parentLocator, menuLocator);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void handleMenuSubMenu(By parentMenuLocator, By subMenuLocator) throws InterruptedException {
		
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenuLocator)).perform();
		Thread.sleep(2000);
		getElement(subMenuLocator).click();
	}

}
