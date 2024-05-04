package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementWithFindElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		List<WebElement> listFooter = driver.findElements(By.cssSelector("footer a"));

		for(int i =0 ; i<listFooter.size(); i++) {
			listFooter.get(i).click();
			driver.navigate().back();
			listFooter = driver.findElements(By.cssSelector("footer a"));
		}
	}

}
