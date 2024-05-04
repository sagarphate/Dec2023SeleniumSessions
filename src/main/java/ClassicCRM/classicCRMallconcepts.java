package ClassicCRM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class classicCRMallconcepts {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		
		By userName = By.xpath("//input[@placeholder='Username']");
		By passWord = By.xpath("//input[@placeholder='Password']");
		By login = By.cssSelector("input.btn.btn-small");
		doLogin(userName, passWord, login);

		// If we do right click on page then it display " View Frame Source" Option then 
		// try these page implemented frame
		
		By frame = By.name("mainpanel");
		doSwitchOnFrame(frame);
		
		By contact = By.xpath("//a[@title='Contacts']");
		doClick(contact);
		
//		By name = By.xpath("//input[@name='cs_name']");
//		By company = By.xpath("//input[@name='cs_company_name']");
//		By email = By.xpath("//input[@name='cs_email']");
//		By search = By.xpath("//input[@value='Search']");
		
		//doAdvanceSearch(name, "Joe Root", company, "Tulesko", email, "joeroot@gmail.com", search);
		
		doSelectRecordFromTable("Joe Root");
		
		By selectValue = By.xpath("//select[@name='do_action']");
		By takeAction = By.xpath("//input[@value='DO']");
		doSelectByValue(selectValue, "SUBSCRIBE",takeAction);
		
		doSwitchOnAlertTakeAction();
		
	}
	
	
	
	public static void doClick(By locator) {
		getElement(locator).click();
	} 
	
	public static void doSwitchOnFrame(By locator) {
	 	WebElement frameElement = getElement(locator);
		driver.switchTo().frame(frameElement);
	}
	
	public static void doSwitchOnAlertTakeAction() {
		Alert alert =  driver.switchTo().alert();
		String alertMess = alert.getText();
		if(alertMess.contains("subscribe all selected contacts")) {
			System.out.println("Selected Record is Subscribe to the Campaign");
		}else
		{
			System.out.println("Selected Record is NOT Subscribe to the Campaign");
		}
		alert.accept();
	}
	
	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}
	
	public static WebElement getElement(String locator) {
 		return driver.findElement(By.xpath(locator));
	}
	public static void doLogin(By userNameLocator, By PassWordLocator, By loginLocator) {
		
		getElement(userNameLocator).sendKeys("apiautomation");
		getElement(PassWordLocator).sendKeys("Selenium@12345");
		getElement(loginLocator).click();
		
	}
	
	public static void doAdvanceSearch(By nameLocator, String name, By compLoctor, String company, By emailLocator, String email, By searchLocator) {
		
		getElement(nameLocator).sendKeys(name);
		getElement(compLoctor).sendKeys(company);
		getElement(emailLocator).sendKeys(email);
		
		getElement(searchLocator).click();
	}
	
	public static void doSelectRecordFromTable(String name) {
		
		String checkXpath = "//a[text()='"+name+"']/parent::td/preceding-sibling::td/input[@name='contact_id']";
		getElement(checkXpath).click();
	}
	
	public static void doSelectByValue(By locator, String value, By doAction) {
		 getElement(locator).click();
		 Select select = new Select(getElement(locator));
		 select.selectByValue(value);
		 
		 getElement(doAction).click();
	}
	
	
	
}
