package ActionClassANDAlertInterfaceConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMultiLevelMoveToElementBigBasket {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		By levelOneMenu = By.xpath("(//span[text()='Category'])[position()=2]");
		By levelTwoMenu = By.linkText("Beverages");
		By levelThreeMenu = By.linkText("Tea");
		By levelfourMenu = By.linkText("Green Tea");

		handleMenuSubMenuLevelFour(levelOneMenu,levelTwoMenu,levelThreeMenu,levelfourMenu);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	} 

	public static void handleMenuSubMenuLevelFour(By lelvelOneMenuLocator, By levelTwoMenuLocator, By levelThreeMenuLocator, By levelfourMenuLocator) throws InterruptedException {
		getElement(lelvelOneMenuLocator).click();
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		act.moveToElement(getElement(levelTwoMenuLocator)).perform();
		Thread.sleep(2000);
		act.moveToElement(getElement(levelThreeMenuLocator)).perform();
		Thread.sleep(2000);
		getElement(levelfourMenuLocator).click();
		
	}
}
