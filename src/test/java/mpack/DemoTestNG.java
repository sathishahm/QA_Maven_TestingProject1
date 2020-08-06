package mpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTestNG {

	// Test Case without main method
	@Test

	public void SampleAutomation() throws Exception {

		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver();
		 * 
		 * driver.get("http://omayo.blogspot.com/");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * 
		 * driver.findElement(By.id("alert1")).click();
		 */

		int age = 5;

		if (age < 18) {

			throw new SkipException("Age should be less than 18");

		}

	}

}
