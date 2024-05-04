package ActionClassANDAlertInterfaceConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		// to do the file upload with selenium in these case 
		// that specific tagname should have attribute as type="file" its mandatory
		Thread.sleep(2000);
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\LENOVO\\Desktop\\Cognizant.txt");
	}

}
