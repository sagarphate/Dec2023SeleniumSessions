package testNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {
	
	@Test
	public void titleTest() {
	    String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals(title, "30-Day Advanced Free Trial | OrangeHRM", "!! Title is Not Matched !!");
	}	
	
	@Test
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("30-day-free-trial"));
	}
}
