package seleniumConcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDoenAllOptions {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
//		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
//		Select select = new Select(country);
//		
//		List<WebElement> countryList = select.getOptions();
//		System.out.println(countryList.size());
//			
//		for(WebElement e : countryList) {
//			String text = e.getText();
//			if(text.equals("India")) {
//				e.click();
//				break;
//			}
//			System.out.println(text);
//		}
		
		By dropDownLocator = By.id("Form_getForm_Country");
		doSelectDropDownValue(dropDownLocator, "India");
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<String> getDropDownOptionsTextList(By locator) {
 		List<WebElement> optionsList = getDropDownOptionsList(locator);
 		List<String> optionsTextList = new ArrayList<String>(); // Top Casting
 		
 		for(WebElement e : optionsList) {
 			String text = e.getText();
 			optionsTextList.add(text);
 		}
 		return optionsTextList;
	}
	
	public static List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	
	public static int getDropDownValueCount(By locator) {
		return getDropDownOptionsList(locator).size();
	}
	
	// With Out used Existing method we are able to select the specific value from drop down list
	public static void doSelectDropDownValue(By Locator, String value ) {
		List<WebElement> optionList = getDropDownOptionsList(Locator);
		for(WebElement e : optionList ) {
			String text = e.getText();
		
			if(text.equals(value)) {
				e.click();
				break;
			}
		}	
	}
	
	public void printSelectDropDownValue(By Locator) {
		List<WebElement> optionsList = getDropDownOptionsList(Locator);
		for(WebElement e : optionsList) {
			String optionText = e.getText();
			System.out.println(optionText);
		}
	}
	
	
}
