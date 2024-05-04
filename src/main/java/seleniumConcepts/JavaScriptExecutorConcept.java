package seleniumConcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String url = js.executeScript("return document.URL").toString();
		System.out.println(url);
		
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		
		// Create JAVASCRIPT Utility class
	}

}
