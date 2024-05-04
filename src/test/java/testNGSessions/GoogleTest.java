package testNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{

	@Test
	public void titleTest() {
	    String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals(title, "Google", "!! Title is Not Matched !!");
	}	
	
	@Test
	public void imageTest() {
		Boolean flag = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("google"));
	}
}
