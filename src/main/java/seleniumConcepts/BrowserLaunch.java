package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	public static WebDriver driver; 
	public static String title;
	public static String url;
	
	public static void launchBrowser(String browser){
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launching Google Chrome Browser");
			
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			
			title = driver.getTitle();
			System.out.println("Title of the page: "+title);
			
			url = driver.getCurrentUrl();
			System.out.println("URL of the Application: "+url);
			
			break;
		case "firefox":
			System.out.println("Launching FireFox Browser");
			
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
			
			title = driver.getTitle();
			System.out.println("Title of the page: "+title);
			
			url = driver.getCurrentUrl();
			System.out.println("URL of the Application: "+url);
			
			break;
		case "edge":
			System.out.println("Launching Microsoft Edge Browser");
			
			driver = new EdgeDriver();
			driver.get("https://www.google.com");
			
			title = driver.getTitle();
			System.out.println("Title of the page: "+title);
			
			url = driver.getCurrentUrl();
			System.out.println("URL of the Application: "+url);
			
			break;
			
		default:
			System.out.println("Please pass the correct browser name : "+browser);
			break;
		}
		driver.close();
	}
	
	public static void main(String[] args) {
		
		launchBrowser("firefox");
	}
}

