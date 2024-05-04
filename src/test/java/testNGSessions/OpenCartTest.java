package testNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {

	@BeforeSuite  // Run at 1
	public void dbconnection() {
		System.out.println("BS -- DB Connection");
	}
	
	@BeforeTest // Run at 2
	public void createUser() {
		System.out.println("BT -- Create User");
	}
	
	@BeforeClass // Run at 3
	public void launchBrowser() {
		System.out.println("BC -- Launch Browser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("BM -- Login To App");
	}
	
	@Test
	public void titleTest() {
		System.out.println("Title Test");
	}
	
	@Test
	public void headerTest() {
		System.out.println("Header Test");
	}
	
	@Test
	public void urlTest() {
		System.out.println("URL Test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM -- Logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- Close Browser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- Delete User");
	}
	
	@AfterSuite
	public void disConnectWithDB() {
		System.out.println("AS -- Disconnect Database");
	}
}
