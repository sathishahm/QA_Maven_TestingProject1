package mpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngParameteraization {

	@Parameters({ "URL" }) // Retreiveing the URL from testing.xml file what we saved
	@Test

	public void parameterization(String url) throws InterruptedException { // String of Testing.xml file added here
																			// method parameter

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url); // same url place over here
		Thread.sleep(3000);
		driver.close();
	}

	@Parameters({ "URL" }) // we can write multiple parameter like URL,email.password
	@Test

	public void parameterization1(String url) throws InterruptedException { // String of Testing.xml file added here

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url); // same url place over here
		Thread.sleep(3000);
		driver.close();
	}

	@Parameters({ "URL" }) // we can write multiple parameter like URL,email.password
	@Test

	public void parameterization2(String url1) throws InterruptedException { // String of Testing.xml file added here

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url1); // same url place over here
		Thread.sleep(3000);
		driver.close();
	}

	public void parameterization3(String url2) throws InterruptedException { // String of Testing.xml file added here

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url2); // same url place over here// only naming thats all
		Thread.sleep(3000);
		driver.close();
	}

}
