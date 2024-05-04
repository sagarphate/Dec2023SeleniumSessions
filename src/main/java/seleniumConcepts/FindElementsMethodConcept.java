package seleniumConcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethodConcept {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

//		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//		System.out.println("All Links Size : "+allLinks.size());
//		
//		List<WebElement> allImgLinks = driver.findElements(By.tagName("img"));
//		System.out.println("All Image Links Size is : "+allImgLinks.size());
		
		By links = By.tagName("a");
		By imgLink = By.tagName("img");
		
		System.out.println("Links Count : "+getElementsCount(links));
		System.out.println("Image Link Count: "+getElementsCount(imgLink));
		
		ArrayList<String> li =  getElementsTextList(links);
		for(String s : li) {
			System.out.println("Text for all Tags :"+s);
		}
		
		System.out.println("-------------------------------------");
		
		ArrayList<String> eleAltValues = getElementAttributeList(links, "href");
		for(String s : eleAltValues) {
			System.out.println("Tag a - href ayttribute value is : "+s);
		}
	}

	public static List<WebElement> getElements(By locator) {
		return	driver.findElements(locator);
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static ArrayList<String> getElementsTextList(By locator) {
		List<WebElement> list = getElements(locator);
		ArrayList<String> finallist = new ArrayList<String>();
		
		for(WebElement e : list) {
			String text = e.getText();
			if(text.length() !=0) {
				finallist.add(text);
			}
		}
		return finallist;
	}
	
	public static ArrayList<String> getElementAttributeList(By locator, String attName) {
		
		 List<WebElement> attList = getElements(locator);
		 ArrayList<String> attFinalList = new ArrayList<String>();
		 
		 for(WebElement e : attList) {
			 String attValue = e.getAttribute(attName);
			 if(attValue.length() !=0 ) {
				 attFinalList.add(attValue);

			 }
 		 }
		 return attFinalList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
