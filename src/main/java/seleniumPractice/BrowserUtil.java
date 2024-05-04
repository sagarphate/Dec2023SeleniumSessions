package seleniumPractice;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 */

public class BrowserUtil {
	
	WebDriver driver;
	/**
	 * This Method is use to initialize the driver on the basis of browser name
	 * @param browserName
	 * @return this returns driver 
	 */
	public WebDriver launchBrowser(String browserName ) {
		
		System.out.println("Browser Name : " +browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;			
		default:
			System.out.println("Please pass correct Browser Name : " +browserName);
			throw new BrowserException("BROWSER NOT FOUND");
		}
		return driver;	
	}

	public void launchURL(String url) {
		if(url == null) {
			throw new BrowserException("URL IS NULL");
		}
		
		if(url.indexOf("http") == 0) {
			driver.get(url);
		}
		else {
			throw new BrowserException("HTTP IS MISSING IN URL");
		}
	}
	
	public void launchURL(URL url) {
		if(url == null) {
			throw new BrowserException("URL IS NULL");
		}
		
		String appUrl = String.valueOf(url);
		
		if(appUrl.indexOf("http") == 0) {
			throw new BrowserException("HTTP IS MISSING IN URL");
		}
		else {
			driver.navigate().to(url);;
		}
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quiteBrowsers() {
		driver.quit();
	}	
}
