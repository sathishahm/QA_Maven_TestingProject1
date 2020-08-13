package mpack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngMultipleTestDataRun {
	
	@Test(dataProvider="getData")
		
	public void multipletestLogin(String username, String password) {
		System.out.println("User Successfuly logged in in using username: "+username+" and password: "+password+"");
				
	}
	
	@DataProvider	
	public Object[][] getData() {
		
		Object data[][] = new Object[3][2]; // 3 for number log-in attempts data and 2 for username and Password
		
		data[0][0] = "Sathish";
		data[0][1] = "12345";
		
		data[1][0] = "Santhesj";
		data[1][1] = "67890";
		
		data[2][0] = "veesh";
		data[2][1] = "98765";
		
		return data;
	}

}
