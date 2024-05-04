package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("All Links Size : "+allLinks.size());
		
		List<WebElement> allImgLinks = driver.findElements(By.tagName("img"));
		System.out.println("All Image Links Size is : "+allImgLinks.size());
		
		for(WebElement e : allImgLinks) {
			//String altValue = e.getAttribute("alt");
			String srcValue = e.getAttribute("src");
			System.out.println(srcValue);
		}
	}
}
