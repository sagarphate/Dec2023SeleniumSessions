package XpathConcept;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickInfoTable {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/nepal-tri-nation-t20i-series-feb-2024-2023-24-1422034/nepal-vs-netherlands-5th-match-1422041/full-scorecard");
		
		//(//a//span[text()='Aryan Dutt']/ancestor::td/following-sibling::td)[position()=1]
		// Catch taker name
		
		//WebElement Name = catchTaker("Noah Croes");
	 	//System.out.println(Name.getText());
		
//	 	List<String> details = getCricketerDetails("Aryan Dutt");
//		for(String s : details) {
//			System.out.println(s);
//		}
		
		List<String> details = getScoreCard("Timm van der Gugten");
		for(String s : details) {
			System.out.println(s);
		}

	}

	public static WebElement catchTaker(String BatsManName) {
		String xpath = "(//a//span[text()='"+BatsManName+"']/ancestor::td/following-sibling::td)[position()=1]";
		return driver.findElement(By.xpath(xpath));
	}
	
	public static List<String> getCricketerDetails(String playerName) {
		
		// ----	(//a//span[text()='Aryan Dutt']/ancestor::td)[position()=1]/following-sibling::td
		String playerXpath = "(//a//span[text()='"+playerName+"']/ancestor::td)[position()=1]/following-sibling::td";
		List<WebElement> detailsList = driver.findElements(By.xpath(playerXpath));
		
		List<String> details = new ArrayList<String>();
		
		for(WebElement e : detailsList) {
			String text = e.getText();
			details.add(text);
		}
		return details;
	}

	public static List<String> getScoreCard(String playerName) {
		
		// (//span[text()='Aryan Dutt']/ancestor::td)[position()=1]/following-sibling::td[contains(@class,'ds-whitespace-nowrap')]
		String xpath = "(//span[text()='"+playerName+"']/ancestor::td)[position()=1]/following-sibling::td[contains(@class,'ds-whitespace-nowrap')]";
		
		List<WebElement> list = driver.findElements(By.xpath(xpath));
		List<String> score = new ArrayList<String>();
		
		for(WebElement e : list) {
			String text = e.getText();
			score.add(text);
		}
		return score;
	}


}
