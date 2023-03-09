package com.saucedemo.TESTpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.saucedemo.POMpack.HomePOMClass;


public class TC2_VerifyLoginOutFunctionality extends TestBaseClass 
{
@Test
	public void VerifyLoginOutFunctionality()
	
	{
	
	 //logOutActivity
		HomePOMClass hp = new HomePOMClass(driver);
		
		hp.clickSettingBtn();
		log.info("Clicked on setting button");
		
		hp.clickLogOutBtn();
		log.info("Clicked on logOut Button");
		
		log.info("Went on loginPage");
		
		log.info("Apply verification");
		  
		  //BA/PO/Dev-> acceptanace criteria
		String expectedTitle = "Swag Labs";   //given
		  
		String actualTitle   = driver.getTitle();
		  
		  if(expectedTitle.equals(actualTitle))
		  {
			  log.info("LogOut Test case is passed");
		  }
		  else
		  {
			  log.info("LogOut Test case is failed");
		  }
		  
		
	}


}
