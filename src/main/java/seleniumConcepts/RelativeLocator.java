package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;


public class RelativeLocator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		WebElement emailId = driver.findElement(By.id("input-email"));
		String emailText = driver.findElement(with(By.xpath("//label[starts-with(text(),'E-Mail')]")).above(emailId)).getText();
		System.out.println(emailText);
		
	 	WebElement belowEle = driver.findElement(By.xpath("//h2[text()='New Customer']"));
	 	WebElement aboveEle = driver.findElement(By.linkText("Continue"));
	 	
		List<WebElement> belowElements = driver.findElements(with(By.tagName("p")).below(belowEle).above(aboveEle));

		for(WebElement e : belowElements) {
			String belowTexts = e.getText();
			System.out.println(belowTexts);
		}
			
		
	}

}
