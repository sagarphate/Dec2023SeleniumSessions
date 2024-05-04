package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		String id_placeholder = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		System.out.println(id_placeholder);
//		
//		String id_name =  driver.findElement(By.id("input-firstname")).getAttribute("name");
//	    String id_class =	driver.findElement(By.id("input-firstname")).getAttribute("class");
//	    
//	    System.out.println(id_name);
//	    System.out.println(id_class);
		
	    By id_place = By.id("input-firstname");
	    String placeholder = getElementGetAttibute(id_place, "placeholder");
	    System.out.println(placeholder);
	    
	    By passConf = By.id("input-confirm");
	    String pass_conf = getElementGetAttibute(passConf, "placeholder");
	    System.out.println(pass_conf);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String getElementGetAttibute(By locator, String attName) {
		return getElement(locator).getAttribute(attName);
	}
}
