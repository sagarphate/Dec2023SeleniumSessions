package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionWithSelectClass {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		WebElement multiSelect = driver.findElement(By.xpath("//select[@multiple]"));
		
		Select select = new Select(multiSelect);
		boolean flag = select.isMultiple();

		if(flag) {
			select.selectByValue("American");
			select.selectByValue("Greater");
			select.selectByValue("Lesser");
		}
		
		select.deselectByValue("Greater");
	}

}
