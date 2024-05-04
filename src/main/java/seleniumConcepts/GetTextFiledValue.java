package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFiledValue {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.id("input-email")).sendKeys("sagar@opencart.com");
		
		String email = driver.findElement(By.id("input-email")).getText();
		System.out.println(email);
		// In these we able to send the value but with help of gettext method we are not able to get that value
	
		//to get these value we have to use getAttribute method and Attribute name id Value for that text filed
		
		String emaiID =driver.findElement(By.id("input-email")).getAttribute("value");
		System.out.println("Value of Text filed is : "+emaiID);
	
	
	
	
	
	
	}

}
