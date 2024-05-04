package ActionClassANDAlertInterfaceConcept;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAuthonticationPopUpBasicAuth {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		//One way to Authenticate these with help of provide the user name and password in the URL
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		//in above when we send the user name and password in the URL then after @ it Expect the domain details
		// If user name and password contains @ then it will not work
		// If we have to use these concept then we have not use @ in user name and password
		
		//Another way is with help of HasAuthentication Interface 
		
		((HasAuthentication)driver).register(()-> new UsernameAndPassword("admin", "admin"));
		
	}

}
