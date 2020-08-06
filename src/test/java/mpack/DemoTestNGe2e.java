package mpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTestNGe2e {
	@Test
	
	public void SampleTestNG() throws InterruptedException {

		WebDriverManager.chromedriver().setup(); // to setup exe file without select exe and pom add

		WebDriver driver = new ChromeDriver();

		// Open the URl
		driver.get("http://tutorialsninja.com/demo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Navigating to Log-in Page
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();

		// Log-in to the application with valid credentials

		driver.findElement(By.id("input-email")).sendKeys("arun.selenium5@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Second@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		//System.out.println(
				//driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[contains(text(),'Account')]")).isEnabled()); // true
		Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[contains(text(),'Account')]")).isEnabled());
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("iphone");

		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();

		Thread.sleep(2000);

		//System.out.println(
				//driver.findElement(By.xpath("//div[@class='caption']//a[contains(text(),'iPhone')]")).isDisplayed()); // true
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='caption']//a[contains(text(),'iPhone')]")).isDisplayed());

		// Adding the items from Product display page to card

		driver.findElement(By.xpath("//div[@class='caption']//a[contains(text(),'iPhone')]")).click();

		//System.out.println(driver.findElement(By.xpath("//a[contains(text(),'iPhone')]")).isDisplayed()); // true
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'iPhone')]")).isDisplayed());

		WebElement quantity = driver.findElement(By.id("input-quantity"));
		quantity.clear();
		quantity.sendKeys("2");

		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"))
				.getText().contains("Success: You have added iPhone to your shopping cart!"));

		
		// Navigating to shopping cart
		driver.findElement(By.xpath("//a[contains(text(),'shopping cart')]")).click();
		//System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Shopping Cart')]")).isDisplayed()); // true
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Shopping Cart')]")).isDisplayed());
		
		// Navigating to check out page
		driver.findElement(By.xpath("//a[text()='Checkout']")).click();
		//System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).isDisplayed()); // true
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).isDisplayed());
		// Enter billing details address
		driver.findElement(By.xpath("//*[@id=\"collapse-payment-address\"]/div/form/div[3]/label")).click();
		driver.findElement(By.id("input-payment-firstname")).sendKeys("Sathisha");
		driver.findElement(By.id("input-payment-lastname")).sendKeys("Manchegowda");
		driver.findElement(By.id("input-payment-address-1")).sendKeys("test one");
		driver.findElement(By.id("input-payment-city")).sendKeys("bangalore");
		driver.findElement(By.id("input-payment-postcode")).sendKeys("571234");

		WebElement country = driver.findElement(By.id("input-payment-country"));
		Select select1 = new Select(country); // Drop down variable
		select1.selectByVisibleText("United Kingdom");

		WebElement region = driver.findElement(By.id("input-payment-zone"));
		Select select2 = new Select(region);
		select2.selectByVisibleText("Angus");

		driver.findElement(By.id("button-payment-address")).click();
		driver.findElement(By.id("button-shipping-address")).click();
		driver.findElement(By.id("button-shipping-address")).click();
		driver.findElement(By.id("button-shipping-method")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.id("button-payment-method")).click();
		driver.findElement(By.id("button-confirm")).click();

		//System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).isDisplayed());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText()
				//.contains("Your order has been placed!"));
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")), "Your order has been placed!");
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"common-success\"]/ul/li[4]/a")).isDisplayed());
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"common-success\"]/ul/li[4]/a")).isDisplayed());
		//System.out.println(
		
				//driver.findElement(By.xpath("//*[@id=\"common-success\"]/ul/li[4]/a")).getText().contains("Success"));
		
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"common-success\"]/ul/li[4]/a")), "Success");
		// driver.quit();

		// *[@id="collapse-payment-address"]/div/form/div[3]/label

	}
}
