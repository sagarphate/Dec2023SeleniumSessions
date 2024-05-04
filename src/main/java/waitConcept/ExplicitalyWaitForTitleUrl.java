package waitConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitalyWaitForTitleUrl {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		// dont use it direct some time to load the title takes time
		// Use explicit wait and use these method
		// driver.getTitle();

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.titleContains("customer relationship management"));
//		String title = driver.getTitle();
//		System.out.println(title);
//
//		String title = waitForTitleContains("customer relationship management", 5);
//		System.out.println(title);
//		
		driver.findElement(By.linkText("Sign Up")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.urlContains("/register/"));
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

	public static String waitForUrlContains(String urlFranctionValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		try {
			if (wait.until(ExpectedConditions.urlContains(urlFranctionValue)))
				return driver.getCurrentUrl();
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("URL id NOT found With In =" +timeOut);
		}
		return null;
	}
	
	public static String waitForUrlToBe(String url, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		try {
			if (wait.until(ExpectedConditions.urlToBe(url)))
				return driver.getCurrentUrl();
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("URL id NOT found With In =" +timeOut);
		}
		return null;
	}
	

	public static String waitForTitleContains(String titleFranctionValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleContains(titleFranctionValue)))
				return driver.getTitle();
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("Title id NOT Found With In = " + timeOut);
		}
		return null;
	}

	public static String waitForTitleIs(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleIs(title)))
				return driver.getTitle();
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("Title id NOT Found With In = " + timeOut);
		}
		return null;
	}

}
