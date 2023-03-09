package com.saucedemo.TESTpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.saucedemo.POMpack.LoginPOMClass;


public class TC01_VerifyLoginActivity extends TestBaseClass
{
	
@Test
	public void verifylogin()
	{
        
        //Validation
        
        String expectedTitle = "Swag Labs";   //given
  	  
  	  String actualTitle   = driver.getTitle();
  	  
  	  if(expectedTitle.equals(actualTitle))
  	  {
  		log.info("Login Test case is passed");
  	  }
  	  else
  	  {
  		log.info("Login Test case is failed");
  	  }
  	  
    
	}	
}