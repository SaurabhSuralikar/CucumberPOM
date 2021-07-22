package com.qa.factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
 
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	//Thread local is used for the parallel execution
//	first we have created the if condition simply for cheking the browser
//	later we convert it to enum or constants
//	Thread loal gives you get and set methodes
	//we are creating the driver instance with the chromedriver using thread loacal
	
//	
//	SRP SIngle responsibility concept every class should do their own task..
//	Like DriverFactory should initialize only and other will load the data in popperty file.
	
	public static ThreadLocal<WebDriver> tl=new ThreadLocal<>();
	public WebDriver init_driver(String browser)
	{
		
			if(browser.equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				tlDriver.set(new ChromeDriver());
				
				
				
			}
				else if (browser.equals("firefox"))
				{
					WebDriverManager.firefoxdriver().setup();
					tlDriver.set(new FirefoxDriver());
				}
			
				else {
					System.out.println("PLease provide valid driver");
				}
		System.out.println("Browser value is" + browser);
		
		//getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	//If 5 threads are calling the the gerDriver()that should be synchronized so useing synchronized
	public static  synchronized WebDriver getDriver()
	{
		return tlDriver.get();
	
		
	}
 
}
