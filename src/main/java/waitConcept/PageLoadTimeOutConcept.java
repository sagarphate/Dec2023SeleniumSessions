package waitConcept;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOutConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		
		
		long loadTime = driver.manage().timeouts().getPageLoadTimeout().getSeconds();
		System.out.println(loadTime);
	}

}
