package ActionClassANDAlertInterfaceConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJsPopUpHandaling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// java Script alert Pop up with OK button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert alert =  driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.accept(); // click on OK button on pop up
		
		//Java Script confirmation Pop Up with Cancel and OK Button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Alert alertOne =  driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println( alertOne.getText());
		alertOne.accept();
	// OR	alertOne.dismiss();
		
		// Java Script Prompt with one input filed and OK and Cancel Button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert alertTwo =  driver.switchTo().alert();
		Thread.sleep(2000);
		alertTwo.sendKeys("SAGAR");
		System.out.println( alertOne.getText());
		alertTwo.accept();
	}

}
