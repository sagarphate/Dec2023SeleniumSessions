package WebTableConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//find total rows in the table // table first row is column 
		List<WebElement> rowsCount = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("Total Row Count  =  " +(rowsCount.size() - 1));
		
		
		List<WebElement> colCount = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("Total Coloum Count  =  " +colCount.size());
		
		//table[@id='customers']/tbody/tr[2]/td[1]
		//table[@id='customers']/tbody/tr[3]/td[1]
		//table[@id='customers']/tbody/tr[4]/td[1]
	//Find the common and changing thing in Xpath
		String beforeXpath = "//table[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
	
		for(int row = 2; row<=rowsCount.size(); row++) {
			String compXpath = beforeXpath + row + afterXpath;
			
			//System.out.println(compXpath);
			
			String compName = driver.findElement(By.xpath(compXpath)).getText();
			System.out.println(compName);
		}
		
		// Xpath with preceding -sibling / following-sibling / parent / ancestor / child 
	
		// get the 1st coloumn values
		//th[text()='Company']/parent::tr/following-sibling::tr/td[1]
		
		//table[@id='customers']//tr/td[1] ----- First Number Column values
		
		//table[@id='customers']//tr/td[2] ---- Second Number Column values
		//table[@id='customers']//tr/td[3] ---- third Number Column values
		
		System.out.println("*****************************************");
		for(int col=1; col<=colCount.size(); col++) {
			List<WebElement> colList =	driver.findElements(By.xpath("//table[@id='customers']//tr/td["+col+"]"));
			for(WebElement e : colList) {
				String data = e.getText();
				System.out.println(data);
			}
			
			System.out.println("---------------------------------");
		}
	}
}
