package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownWithOutUsingSelectClass {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		// Not allowed to use Select Class
			
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		//By county = By.id("Form_getForm_Country"); // it give only one element
		
		// With help of Xpath able to get all county list
//		List<WebElement> countyList = driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
//		
//		System.out.println(countyList.size()-1);
//		
//		for(WebElement e : countyList) { // select all options
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		By dropDownlocator = By.xpath("//select[@id='Form_getForm_Country']/option");
		doSelectValueFromDown(dropDownlocator, "India");
		doSelectValueFromDown(dropDownlocator, "Israel");
		doSelectValueFromDown(dropDownlocator, "Spain");
		
	}	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	// find the value from drop down list and click on that
	public static void doSelectValueFromDown(By locator, String value) {
		List<WebElement> optionList = getElements(locator);
		for(WebElement e : optionList) {
			String text = e.getText();
			
			if(text.equals(value)) {
				e.click();
				break;
			}
		}	
	}
	
	
	
}
