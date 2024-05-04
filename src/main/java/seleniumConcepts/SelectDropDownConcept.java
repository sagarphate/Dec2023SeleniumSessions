package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import seleniumPractice.ElementException;

public class SelectDropDownConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
//		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
//		
//		// In select Class we can supply the web Element of drop down
//		Select select = new Select(country);
//		select.selectByIndex(5);  // Used when index Fixed numbers Ex Months drop down
//		select.selectByValue("India");
//		select.selectByVisibleText("Vatican City");
		
		By country = By.id("Form_getForm_Country");
		//doSelectByIndex(country, 5);
		doSelectByValue(country, null); 
		//doSelectByVisibleText(country, "Vatican City");
		
		//For all Index , value and VisibleText if pass no city contain city name then it give Exception as NoSuchElementException
		// pass as null - value - nullpointerException give
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByIndex(By locator, int index ) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectByValue(By locator, String value) {
		if(value == null || value.length() == 0) {
			throw new ElementException("PLEASE PASS THE CORRECT VALUE -- VALUE Is NULL");
		}
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelectByVisibleText(By locator, String visibleText) {
		if(visibleText == null || visibleText.length() == 0) {
			throw new ElementException("PLEASE PASS THE CORRECT TEXT -- TEXT Is NULL");
		}
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	
	
	

}

