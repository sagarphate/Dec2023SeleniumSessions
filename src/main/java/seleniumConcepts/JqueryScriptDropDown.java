package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryScriptDropDown {

	static WebDriver driver;
	
	public static void main(String[] args)  {
		
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
//		driver.findElement(By.id("justAnInputBox")).click();
//		
//		List<WebElement> checkList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//		
//		for(WebElement e : checkList) {
//			String text = e.getText();
//			if(text.contains("choice 4")) {
//				e.click();
//				break;
//			}
//		}

		By dropDownLocator = By.id("justAnInputBox");
		By choiceLocator = By.xpath("//span[@class='comboTreeItemTitle']");
		
		//TC 01 is Single Value Selection
		//selectMultiChoice(dropDownLocator, choiceLocator, "choice 4");
		
		//TC 02 is Multiple Value Selection
		//selectMultiChoice(dropDownLocator, choiceLocator, "choice 4", "choice 1", "choice 3", "choice 6 2 1", "choice 6 2 3", "choice 7");
		
		//TC 02 is Multiple Value Selection as well Single Selection also Work
		//selectMultiChoice(dropDownLocator, choiceLocator, "choice 5");
		
		//TC 03 is All Value Selection 
		//selectMultiChoice(dropDownLocator, choiceLocator, "choice 4");
		selectMultiChoice(dropDownLocator, choiceLocator, "all");
		//selectMultiChoice(dropDownLocator, choiceLocator, "choice 4", "choice 1", "choice 3", "choice 6 2 1", "choice 6 2 3", "choice 7");

		
		//TC 02 is Multiple Value Selection = String Array
//		String choice[]= {"choice 4", "choice 1", "choice 3"};
//		selectMultiChoice(dropDownLocator, choiceLocator, choice);
		
	}
	
	//TC 01 is Single Value Selection
//	public static void selectMultiChoice(By dropDownLocator, By choiceLocator, String value) {
//			getElement(dropDownLocator).click();
//			
//			List<WebElement> choiceList = getElements(choiceLocator); // 44 size
//			
//			for(WebElement e:choiceList) {
//				if(e.getText().contains(value)){
//					e.click();
//					break;
//				}
//			}
//	}
	
	
	//TC 02 is Multiple Value Selection same method used for single Selection as well
	// in same Method need to do the All selection as
	
	/**
	 * This Method is used to handle Single selection, Multiple selection and All selection (Please pass 'all' for all selection) 
	 * @param dropDownLocator
	 * @param choiceLocator
	 * @param value
	 */
	public static void selectMultiChoice(By dropDownLocator, By choiceLocator, String... value)  {
		getElement(dropDownLocator).click();
		
		List<WebElement> choiceList = getElements(choiceLocator); // 44 size
		
		if(value[0].equals("all")) {  // select all
			for(WebElement e:choiceList) {
				e.click();
			}
		}
		else {
			for(String choice : value) { // for single and multiple selection
				for(WebElement e:choiceList) {
					if(e.getText().equals(choice)) {
						try {
							e.click();
						}
						catch (ElementNotInteractableException ex) {
							break;
						}
					}
				}
			}
		}
	}
	
	//TC 03 is All Value Selection
	
	
	//TC 02 is Multiple Value Selection with String Array
//		public static void selectMultiChoice(By dropDownLocator, By choiceLocator, String choice[]) {
//			getElement(dropDownLocator).click();
//			
//			List<WebElement> choiceList = getElements(choiceLocator); // 44 size
//			
//			for(String c : choice) {
//				for(WebElement e:choiceList) {
//					if(e.getText().equals(c)) {
//						e.click();
//					}
//				}
//			}
//		}
		
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
