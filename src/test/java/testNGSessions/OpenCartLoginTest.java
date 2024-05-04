package testNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginTest extends BaseTest {

	@Test
	public void titleTest() {
	    String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals(title, "Account Login", "!! Title is Not Matched !!");
	}	
	
	@Test
	public void imageTest() {
		Boolean flag = driver.findElement(By.cssSelector(".img-responsive")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("account/login"));
	}
	
}
