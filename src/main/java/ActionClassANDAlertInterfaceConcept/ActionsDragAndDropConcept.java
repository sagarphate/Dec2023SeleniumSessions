package ActionClassANDAlertInterfaceConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDropConcept {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frameEle = driver.findElement(By.cssSelector("iframe.demo-frame"));
		
		driver.switchTo().frame(frameEle);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		//act.clickAndHold(source).moveToElement(target).release().build().perform();
		
		//act.dragAndDrop(source, target).perform();
		
		Action action = act.clickAndHold(source).moveToElement(target).release().build();
	 
		action.perform();
	}

}
