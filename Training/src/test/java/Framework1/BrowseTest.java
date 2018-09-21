package Framework1;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;

public class BrowseTest {
	
	
	@BeforeSuite
	public void Browse() throws IOException, InterruptedException {
		
		Runtime.getRuntime().exec("cmd /c start C:\\appiumstart.bat");
		
		
		
		Thread.sleep(7000L);
		
		//Runtime.getRuntime().exec("cmd /c stop C:\\appiumstart.bat");
		
		
		
		System.out.println("run the appium server successfully");
		
		
	}

}
