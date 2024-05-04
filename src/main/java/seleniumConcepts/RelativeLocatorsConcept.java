package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class RelativeLocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/in/dashboard/canada");
		Thread.sleep(4000);
		
		WebElement baseEle = driver.findElement(By.xpath("(//a[text()='Cold Lake, Canada'])[1]"));
		
		String leftValue = driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(baseEle)).getText();
		System.out.println("left Value = "+leftValue);
		
		String rightValue = driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(baseEle)).getText();
		System.out.println("right Value = "+rightValue);
		
		String aboveValue = driver.findElement(RelativeLocator.with(By.tagName("p")).above(baseEle)).getText();
		System.out.println("above Value = "+aboveValue);
		
		String belowValue = driver.findElement(RelativeLocator.with(By.tagName("p")).below(baseEle)).getText();
		System.out.println("below Value = "+belowValue);
		
		String nearEle = driver.findElement(RelativeLocator.with(By.tagName("p")).near(baseEle)).getText();
		System.out.println("below Value = "+nearEle);
		
	}

}
