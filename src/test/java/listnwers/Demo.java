package listnwers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

// demo java program with Listeners
public class Demo {

	@Test
	public void listeners1() {
		// Test Execution Start
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int a = 1, b = 5, c = 6;

		if (a == 1) {
			Assert.assertTrue(b < c);

		}

		if (a == 2) {

			Assert.assertTrue(b > c);
		}

		if (a == 3) {
			throw new SkipException("Test Skipped");

		}

		driver.close();
		// Test Execution Finished here

	}

	@Test
	public void listeners2() {
		// Test Execution Start
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int a = 2, b = 5, c = 6;

		if (a == 1) {
			Assert.assertTrue(b < c);

		}

		if (a == 2) {

			Assert.assertTrue(b > c);
		}

		if (a == 3) {
			throw new SkipException("Test Skipped");

		}

		driver.close();
		// Test Execution Finished here

	}

	@Test
	public void listeners3() {
		// Test Execution Start
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int a = 3, b = 5, c = 6;

		if (a == 1) {
			Assert.assertTrue(b < c);

		}

		if (a == 2) {

			Assert.assertTrue(b > c);
		}

		if (a == 3) {
			throw new SkipException("Test Skipped");

		}

		driver.close();
		// Test Execution Finished here

	}

}
