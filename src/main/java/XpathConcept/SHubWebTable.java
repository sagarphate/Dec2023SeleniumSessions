package XpathConcept;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SHubWebTable {

	static WebDriver driver;
	
	public static void main(String[] args) {


		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
//		String xpath_joeRoot= "//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']";
//		driver.findElement(By.xpath(xpath_joeRoot)).click();
		
		//selectUser("Joe.Root");
		//selectUser("Garry.White");
		
		List<String> joeDetails = getUserDetails("Joe.Root");
		for(String s : joeDetails) {
			System.out.println(s);
		}
		
		System.out.println("*****************************");
		
		List<String> smithDetails = getUserDetails("John.Smith");
		for(String s : smithDetails) {
			System.out.println(s);
		}
		
		
		
		//a[text()='Joe.Root']/parent::td/following-sibling::td
	}
	
	// Application specific Utility/Generic Method  -- not used for others application
	
	public static void selectUser(String userName) {
		String xpath_joeRoot= "//a[text()='"+userName+"']/ancestor::tr//input[@type='checkbox']";
		driver.findElement(By.xpath(xpath_joeRoot)).click();
	}
	
	
	public static List<String> getUserDetails(String userName) {
		String xpath = "//a[text()='"+userName+"']/parent::td/following-sibling::td";
		List<WebElement> list = driver.findElements(By.xpath(xpath));
		List<String> details = new ArrayList<String>();
		
	    for(WebElement e : list) {
	    	String text = e.getText();
	    	details.add(text);
	    }
	    return details;
	}
	
	
}
