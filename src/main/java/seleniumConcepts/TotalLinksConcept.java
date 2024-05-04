package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		// Count total number of links on page
		// Print text of each link
		// avoid blank links
		// Count Broken links on the page
		
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		// print text of each link
		for(int i=0; i<allLinks.size(); i++) {
		
			String text = allLinks.get(i).getText();
			if(text.length() !=0 ) {
				System.out.println(text);
			}
		}
		
		
		System.out.println("--------------------------------------------");
		
		for(WebElement link : allLinks) {
			String text = link.getText();
			if(text.length() != 0) {
				System.out.println(text);
			}
		}
		
		System.out.println("--------------------------------------------");
		
		By TotalLinks = By.tagName("a");
		int count = getElementCount(TotalLinks);
		System.out.println("TOTAL LINKS ON PAGE IS : "+count);
		
		By TotalTextFileds = By.className("form-control");
		int txtFileds = getElementCount(TotalTextFileds);
		System.out.println("TOTAL TEXT FILED ON PAGE IS : "+txtFileds);
	}
	
	public static int getElementCount(By locator) {
		return driver.findElements(locator).size();
	}

}
