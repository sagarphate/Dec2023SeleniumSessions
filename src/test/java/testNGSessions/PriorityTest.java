package testNGSessions;

import org.testng.annotations.Test;

public class PriorityTest {

	
	@Test(priority = 1)
	public void eTest() {
		System.out.println("e Test");
	}
	
	@Test(priority = 3)
	public void dTest() {
		System.out.println("d Test");
	}
	
	@Test(priority = 2)
	public void aTest() {
		System.out.println("a Test");
	}
	
	@Test(priority = 5)
	public void bTest() {
		System.out.println("b Test");
	}
	
	@Test(priority = 4)
	public void cTest() {
		System.out.println("c Test");
	}
	
	
	
	
}
