package waitConcept;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitalyWaitForMultipleWindows {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Desktop/Links.html");
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		if(wait.until(ExpectedConditions.numberOfWindowsToBe(6))) {
			
			Set<String> idDetails = driver.getWindowHandles();
			System.out.println(idDetails.size());
			Iterator<String> ids = idDetails.iterator();
			
			while(ids.hasNext()) {
				String id = ids.next();
				driver.switchTo().window(id);
			 	System.out.println(driver.getTitle());
			}
		}
	}
	
	public static boolean waitForWindows(int totalNumberOfWindow, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(totalNumberOfWindow));
	}

}
