package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSession {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		String title = driver.getTitle();
		System.out.println("page title is: "+title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//driver.close();
		driver.quit();
		//System.out.println(driver.getTitle());
	
	
	}
}
