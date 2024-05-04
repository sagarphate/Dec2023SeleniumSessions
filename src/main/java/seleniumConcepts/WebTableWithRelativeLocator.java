package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class WebTableWithRelativeLocator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		WebElement JoeRoot = driver.findElement(By.linkText("Joe.Root"));

		driver.findElement(with(By.tagName("input")).toLeftOf(JoeRoot)).click();
	}

}
