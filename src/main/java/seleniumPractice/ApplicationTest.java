package seleniumPractice;

public class ApplicationTest {

	public static void main(String[] args) {
		
		String browserName = "chrome";
		BrowserUtil brUtil = new BrowserUtil();
		
		brUtil.launchBrowser(browserName);
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/");
		
		String actualTitle = brUtil.getTitle();
		if(actualTitle.equals("Your Store")) {
			System.out.println("Title -- PASS");
		}
		else {
			System.out.println("Title -- FAIL");
		}
		
		String url = brUtil.getPageUrl();
		if(url.contains("opencart")) {
			System.out.println("URL is Correct - PASS");
		}
		else {
			System.out.println("URL is InCorrect - FAIL");
		}
		
		brUtil.quiteBrowsers();
	}

}
