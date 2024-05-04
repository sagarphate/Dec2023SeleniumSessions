package ActionClassANDAlertInterfaceConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameHandaling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		Thread.sleep(2000);
		
		WebElement iframeEle = driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]"));
		
		// with help of frame index / name we can switch to the frame
		driver.switchTo().frame(iframeEle); // with help of web element we can switch to the frame
		
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("SAGAR");
		
		driver.switchTo().defaultContent(); // driver switch from frame to page
		
		String text = driver.findElement(By.xpath("//h3[text()='Vehicle Registration Form']")).getText();
	
		System.out.println(text);
	}

}
