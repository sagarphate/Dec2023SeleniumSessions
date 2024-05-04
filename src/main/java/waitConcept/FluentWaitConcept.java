package waitConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {

	public static void main(String[] args) {
		
		// Wait is the Interface have declared Until()
		// FluentWait implements wait Interface and provided body to Until() and it has its own another methods as well
		// WebDriverWait extends FluentWait class 
		// WebDriverWait is the child of FluentWait class - it can able to access all methods in FluentWait class
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.cssSelector("div#imageTemplateContainer")).click();
		By imageLocator = By.xpath("//iframe[contains(@id,'frame-one')]");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
									.withTimeout(Duration.ofSeconds(10))
									.pollingEvery(Duration.ofSeconds(2))
									.ignoring(NoSuchElementException.class)
									.withMessage("Time Out ... Element Not Present..");

		WebElement imag_ele = wait.until(ExpectedConditions.visibilityOfElementLocated(imageLocator)); 
		imag_ele.click();
		
		
		
//		WebDriverWait waitOne = new WebDriverWait(driver, Duration.ofSeconds(10));
//				waitOne.pollingEvery(Duration.ofSeconds(2))
//					   .ignoring(NoSuchElementException.class)
//					   .withMessage("Time Out ... Element Not Present.."); 
	
	}
}
