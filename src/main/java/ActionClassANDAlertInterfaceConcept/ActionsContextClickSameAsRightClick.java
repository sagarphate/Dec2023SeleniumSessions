package ActionClassANDAlertInterfaceConcept;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsContextClickSameAsRightClick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		
		act.contextClick(rightClickBtn).perform();
	
		List<WebElement> optionList = driver.findElements(By.cssSelector("ul.context-menu-list > li:not(.context-menu-separator)"));
		
		for(WebElement e : optionList) {
			String text = e.getText();
			if(text.equals("Copy")) {
				e.click();
				break;
			}
		}
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		alert.accept();
	}
}
