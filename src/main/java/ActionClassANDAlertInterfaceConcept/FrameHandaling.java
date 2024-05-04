package ActionClassANDAlertInterfaceConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandaling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.switchTo().frame("mainpanel"); // driver start to work with in the frame element
		// IF we not switch to frame then it give NoSuchElementException: no such element: Unable to locate element: 
		driver.findElement(By.linkText("CONTACTS")).click();
		
		driver.switchTo().defaultContent(); // driver will move back to Page 
		
	}

}
