package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://naveenautomationlabs.com/opencart/");
		String title1 = driver1.getTitle();
		System.out.println(title1);
		String url1 = driver1.getCurrentUrl();
		System.out.println(url1);
		
		driver.close();
	}
}
