package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;

import com.qa.util.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

//It is like Test class in TESTNG where pre and post annotations we creates
//Hooks resp to launch the browser
public class ApplnHooks {
	
	private DriverFactory DriverFactory;
	private WebDriver driver;
	private configReader configReader;
	Properties prop;
	
	
	
	@Before(order= 0)
	public void getProperty()
	{
	
		configReader = new configReader();
		prop=configReader.initializeProc();
	}
	
	@Before(order =1)
	
	public void launchBrowser()
	{
		String browserName=prop.getProperty("browser");
		
		DriverFactory= new DriverFactory();
		//DriverFactory.init_driver(browserName);
		//here if we dont store the driver it will give the null pointer as 
		//we dont have store any value of driver..
//		below must be change
//		DriverFactory= new DriverFactory();
//		driver= DriverFactory= new DriverFactory();
//		
		driver=DriverFactory.init_driver(browserName);
	}
	
	@After(order =0)
	public void quitBrowser()
	{
		driver.quit();
	}
	
	@After(order =1)
	public void tearDown(Scenario Scenerio)
	{
	
		if(Scenerio.isFailed())
		{
			System.out.println("Failed");
			//take screnshot here
			Scenerio.getName();
			String ScreenshotName=Scenerio.getName().replaceAll(" ", "_");
		byte[] sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
		//here don't use File if intrigrating with the Jenkins or other CI/CD pipelines
		//It will not take FILE type..ByYTE64  or BYTE need to use
		Scenerio.attach(sourcepath, "image/png", ScreenshotName);
		}
	}
	}

	


