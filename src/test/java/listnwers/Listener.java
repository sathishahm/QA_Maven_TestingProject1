package listnwers;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test execution Started: " +result.getName());
	}

	public void onFinisht(ITestContext context) {
		System.out.println("Test execution Ended: " +context.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test execution Successful: " +result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		
		//Take a ScreenShot
		//Updating the failure status into the test Results
		//update in logs
		System.out.println("Test execution failed: " +result.getName());
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test execution got skipped: " +result.getName());
	}

}
