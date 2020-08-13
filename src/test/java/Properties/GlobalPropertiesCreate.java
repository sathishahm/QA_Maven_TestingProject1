package Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GlobalPropertiesCreate {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("data.properties");
		// Retriew the code
		prop.load(fis);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));   // read from data.properties file(not hardcoded)
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("email")); // read from data.properties file(not hardcoded) 																						// file(not hardcoded)
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password")); // read from data.properties file(not hardcoded
																							
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		
		/* NORMAL DATA.PROPERTIES FILE EXAMPLE
		 * Properties prop = new Properties();
		 * 
		 * // read the data.properties file through inputstream FileInputStream fis =
		 * new FileInputStream("data.properties");
		 * 
		 * //Retriew the code prop.load(fis);
		 * System.out.println(prop.getProperty("url"));
		 * System.out.println(prop.getProperty("email"));
		 * System.out.println(prop.getProperty("password"));
		 * 
		 * prop.setProperty("result", "pass");
		 * 
		 * // update the data.properties file through outputstream FileOutputStream fos
		 * = new FileOutputStream("data.properties"); 
		 * prop.store(fos, null);  // fail text updated to pass in data.properties file
		 */

	}

}
