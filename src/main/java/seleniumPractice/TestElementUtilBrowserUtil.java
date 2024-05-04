package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestElementUtilBrowserUtil {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();	
		WebDriver driver = brUtil.launchBrowser("chrome");
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title =  brUtil.getTitle();
		System.out.println(title);
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		By username = By.id("input-email");
		By password = By.id("input-password");
		
		eleUtil.doSendKeys(username, "sagarphate@gmail.com");
		eleUtil.doSendKeys(password, "sagar@123");
		
		//brUtil.closeBrowser();
	}
}
