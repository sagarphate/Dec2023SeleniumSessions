package waitConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollingTimeConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		
		By submit = By.id("submitButton");
		
		/**
		 * Wait will ignore instances of NotFoundException that are encountered (thrown) 
		 * by default in the'until' condition, and immediately propagate all others. 
		 * You can add more to the ignore list by calling ignoring
		 * 
		 * Parameters: 
		 * driver - The WebDriver instance to pass to the expected conditions
		 * timeout - The timeout in seconds when an expectation is called
		 * sleep - The duration in milliseconds to sleep between polls.
		 * 
		 */
													// Total Time			 // interval time / sleep time
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(submit)).click();

	}

}
