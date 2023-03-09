package com.saucedemo.TESTpack;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.saucedemo.POMpack.LoginPOMClass;

public class TestBaseClass 
{

WebDriver driver;
	Logger log = Logger.getLogger("SauceDemo_15Oct");
	@BeforeMethod
	public void setUp() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");	
        	
		driver = new ChromeDriver();
		PropertyConfigurator.configure("log4j.properties");
		log.info("Browser is opened");
		
		driver.manage().window().maximize();
		log.info("Browser is maximized");
	
	    driver.get("https://www.saucedemo.com/");
	    log.info("Url is opened");
	    
	    //take screenshot
//	    UtilityClass.screenshotMethod(driver, "TC01_loginPageScreenshot");
//	  	System.out.println("Screenshot is taken");
//	    
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	   	    

	    LoginPOMClass lp = new LoginPOMClass(driver);   
	    
	    lp.sendUsername();
	    log.info("Username is entered");
	    
	    lp.sendPassword();
	    log.info("Password is entered");
	    
	    lp.clickLoginBtn();
	    log.info("Clicked on login button");

	    //homePage
	    log.info("Went on homePage");
	}
	  	//take screenshot
//	  	UtilityClass.screenshotMethod(driver, "TC01_homePageScreenshot");
//	  	System.out.println("Screenshot is taken");	  		
//	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		log.info("Browser is closed");
		log.info("End of Program");
		  	    
	}

}

	
