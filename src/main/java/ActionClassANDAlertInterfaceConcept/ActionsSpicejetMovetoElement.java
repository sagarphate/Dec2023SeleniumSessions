package ActionClassANDAlertInterfaceConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSpicejetMovetoElement {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		By parentLocator = By.xpath("//div[text()='Add-ons']");
		By menuLocator = By .xpath("//div[text()='Visa Services']");
		handleMenuSubMenuLevelTwo(parentLocator, menuLocator);
	}

	public static WebElement getElemet(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void handleMenuSubMenuLevelTwo(By parentLocator, By menuLocator) throws InterruptedException {
		
		Actions act = new Actions(driver);
		act.moveToElement(getElemet(parentLocator)).perform();
		Thread.sleep(2000);
		getElemet(menuLocator).click();
		
	}
}
