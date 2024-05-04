package WebTableConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(4000);
		
		driver.switchTo().frame("mainpanel");
		// In DOM has text as Contacts and in display it has CONTACTS 
		// in these case for loacator we have to use the display text not a DOM - application related
		driver.findElement(By.linkText("CONTACTS")).click(); 
	
		selectContact("Josh Buttler");
		getCompanyName("Josh Buttler");
		getPhoneNumber("Josh Buttler");
		getContactsInfoList("Josh Buttler");
	}
	
	public static void selectContact(String contactName) {
		 
		String checkBox = "//a[text()='"+contactName+"']/parent::td/preceding-sibling::td/input[@name='contact_id']";
		driver.findElement(By.xpath(checkBox)).click();
	
	}
	
	public static void getCompanyName(String contactName) {
		
		String companyXpath = "//a[text()='"+contactName+"']/parent::td/following-sibling::td/a[contains(text(),'Emerson')]";
		String CompName = driver.findElement(By.xpath(companyXpath)).getText();
		System.out.println(CompName);
	}
	
	public static void getPhoneNumber(String contactName) {
		
		String phoneXpath = "(//a[text()='"+contactName+"']/parent::td/following-sibling::td/child::span)[1]";
		String phoneNumber =  driver.findElement(By.xpath(phoneXpath)).getText();
		System.out.println(phoneNumber);
	}
	
	public static void getContactsInfoList(String contactName) {
		String allDetailsXpath = "//a[text()='"+contactName+"']/parent::td/following-sibling::td";
		
		List<WebElement> list = driver.findElements(By.xpath(allDetailsXpath));
		
		for(int i=0; i<list.size()-1;i++) {
		    System.out.println(list.get(i).getText());
		}
	}
}
