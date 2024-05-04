package testNGSessions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvocationCount {

	@BeforeTest
	public void createUser() {
		System.out.println("BT - Create User");
	}
	
	@Test(invocationCount = 5)
	public void createUserTest() {
		System.out.println("Create User Test");
	}
	
	@Test
	public void paymentTest() {
		System.out.println("Payment Test");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- Delete User");
	} 
}
