package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NevigationMethodConcept {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Amazon.com");
		System.out.println(driver.getTitle());
		
		//driver.navigate().to("https://google.com");
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.close();
		
		// their is no any difference in get and Navigate().to() Method
		// Both work as same just to() method is over loaded with String and URL
	}
}
