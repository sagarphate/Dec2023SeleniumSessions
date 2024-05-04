package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEnabledandSelected {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		
		//If any filed has attribute as displayed = "disabled" - on these element we not able to take action 
		// on click of other element such as check box that the disabled element will be enabled 
		// to validate we have IsEnabled() Method in Selenium
		
		boolean flag_one = driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(flag_one);
		boolean flag_two = driver.findElement(By.name("agreeTerms")).isDisplayed();
		System.out.println(flag_two);
		
		boolean flag = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag);
		
		boolean check_flag = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(check_flag);
		
		driver.findElement(By.name("agreeTerms")).click();
		
		check_flag = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(check_flag);
		
		flag = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag);
			
		
	
	
	}
}
