package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSerchSuggestions {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
//		driver.findElement(By.name("q")).sendKeys("Selenium");
//		Thread.sleep(3000);
//		List<WebElement> serchList = driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span"));
//		System.out.println( serchList.size() );
//		for(WebElement e : serchList) {
//			String text = e.getText();
//			System.out.println(text);
//			
//			if(text.contains("python")) {
//				e.click();
//				break;
//			}
//		}
		
		By enterSeachValue = By.name("q");
		By searchList = By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span");
		
		doSerch(enterSeachValue, searchList, "java", "compiler");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void doSerch(By searchlocator, By searchSuggutions, String searchkey , String value ) throws InterruptedException {
		
		getElement(searchlocator).sendKeys(searchkey);
		Thread.sleep(3000);
		List<WebElement> suggList = getElements(searchSuggutions);
		
		for(WebElement e: suggList) {
			String text = e.getText();
			if(text.contains(value)) {
				e.click();
				break;
			}
		}
	}

}
