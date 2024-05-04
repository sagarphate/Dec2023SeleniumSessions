package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class SVGElementMapExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		Thread.sleep(5000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
		driver.switchTo().frame(frame);	
		Thread.sleep(5000);
		String mapXpath = "//*[local-name()='svg'and @id='map-svg']//*[name()='g' and @id='regions']/*[name()='g']";
		List<WebElement> stateList = driver.findElements(By.xpath(mapXpath));
		
		System.out.println(stateList.size());
		
		//Actions action = new Actions(driver);
		
		for(WebElement e : stateList) {
			
			//action.moveToElement(e).perform();
			String stateId = e.getAttribute("id");
			System.out.println(stateId);
			Thread.sleep(500);
		}
	}

}
