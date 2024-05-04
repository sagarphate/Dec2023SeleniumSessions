package testNGSessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenCartTestNGAssignment {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test(priority = 1)
	public void validatePageDetails() {
		
		if(driver.findElement(By.xpath("//img[@title='naveenopencart']")).isDisplayed()) {
			System.out.println("Image is present on Page");
		}	
		
		List<WebElement> list = driver.findElements(By.cssSelector(".list-group-item"));
		ArrayList<String> value = new ArrayList<String>(); 
		for (WebElement e : list) {
			String text = e.getText();
			value.add(text);
		}
		
		if(value.contains("Login") && value.contains("Register") ) {
			System.out.println("Both Text presents");
		}
	}	
	
	@Test (priority = 2)
	public void loginToApp() {
		driver.findElement(By.id("input-email")).sendKeys("sagarp@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Sagar@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@Test (priority = 3)
	public void userIsLogin() {
		String url = driver.getCurrentUrl();
		if(url.contains("account/account")) {
			System.out.println("User Sucessfuly Login to Application");
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
