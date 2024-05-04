package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import seleniumPractice.BrowserUtil;
import seleniumPractice.ElementUtil;

public class RegistrationPageByLocator {

	
	public static String getRandomEmailId() {
		return "automation"+System.currentTimeMillis()+"@"+"opencart.com";
	}
	
	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = brUtil.getTitle();
		System.out.println("Title of registration Page : " +title);
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailId = By.name("email");
		By telephone = By.name("telephone");
		By password = By.xpath("//input[@placeholder='Password']");
		By confPassword = By.xpath("//input[@placeholder='Password Confirm']");
		
		By policy = By.name("agree");
		By btnContinue = By.xpath("//input[@type='submit']");
		
		By successMess = By.tagName("h1");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.doSendKeys(firstName, "sagar");
		eleUtil.doSendKeys(lastName, "phate");
		eleUtil.doSendKeys(emailId, getRandomEmailId());
		eleUtil.doSendKeys(telephone, "9096457812");
		eleUtil.doSendKeys(password, "sagar@123");
		eleUtil.doSendKeys(confPassword, "sagar@123");
		
		
		eleUtil.doClick(policy);
		eleUtil.doClick(btnContinue);
		
		String actualMess = eleUtil.getElementText(successMess);
		System.out.println("Actual Message show once registration done : "+actualMess);
		
		if(actualMess.equals("Your Account Has Been Created!")) {
			System.out.println("User Registration is -- PASSED");
		}
		else {
			System.out.println("User Registration is -- FAILD");
		}
	
		brUtil.getPageUrl();
	}
}
