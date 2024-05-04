package windowHandlesConcept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Desktop/Links.html");
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Thread.sleep(3000);
		
		// Fetch window ids
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
