package mpack;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestNG2 {

	/*
	 * @Test public void SampleTest2() {
	 * 
	 * Assert.assertEquals(7, 8); 
	 * int a = 8, b=7; Assert.assertTrue(a>b);
	 * Assert.assertNotEquals("Bye", "Bye");
	 *  Assert.assertFalse(b>a); Assert.fail();
	 * 
	 * }
	 */
	
	/*
	@AfterClass
	public void closure() {
		System.out.println("Closing the Browser");
	} 
	 
	@BeforeClass
	public void Setup() {
		System.out.println("Launching the chromebrowser and application URL");
	} 
	
	/*
	@AfterMethod
	public void closure() {
		System.out.println("Closing the Browser");
	}
	
	@BeforeMethod
	public void Setup() {
		System.out.println("Launching the chromebrowser and application URL");
	} */

	@Test(priority=1)
	public void Registration() {
		System.out.println("Registration Done");

	}

	@Test(priority=2)
	public void Login() {
		System.out.println("Log in the application");

	}

	@Test(enabled=false)
	public void HomePage() {
		System.out.println("Home page executed");

	}

}
