package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementConcept {

	public static void main(String[] args) {
		
		// SVG - Scaler Vector Graph
		// some - image, picture, star
		// Normal Xpath is not work
		
		// Normal Xpath for SVG //svg[@fill='none'] is not work
		
		// ----- //*[local-name()='svg'] - it all SVG elements list
		// ------ above SVG is under the //button tag
		
		// then Unique Xpath for SVG is //button//*[local-name()='svg'] OR //button/*[local-name()='svg']
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("mackbook");
		driver.findElement(By.xpath("//button/*[local-name()='svg']")).click();
		
		

	}

}
