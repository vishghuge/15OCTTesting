package com.saucedemo.POMpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass {


		//1.WebDriver globally declared
		WebDriver driver;

		//username
		//password
		//loginBtn

		//we r not going to use this findElement method	
	  //		WebElement username =driver.findElement(By.xpath("username xpath"));

		//annotation -> starts with @
		//annotations works like method only
		//	@FindBy

		//2.Element find with @FindBy

       @FindBy(xpath="//input[@id='user-name']")
		WebElement username;

		//3.Element action perform in a method
		public void sendUsername()
		{
			username.sendKeys("standard_user");
		}


		//		@FindBy(id="password")

		//or
		@FindBy(xpath="//input[@id='password']")
		WebElement password;

		public void sendPassword()
		{
			password.sendKeys("secret_sauce");
		}


		@FindBy(xpath="//input[@id='login-button']")
		WebElement loginBtn;

		public void clickLoginBtn()
		{
			loginBtn.click();
		}


		//4.constructor create
		public LoginPOMClass(WebDriver driver)
		{
			//global      local
			this.driver = driver;

			PageFactory.initElements(driver, this);
		}
	

		//POM class
		//1.WebDriver globally declared
		//2.@FindBy ele find
		//3.Ele action->method create
		//4.COnstructor create-




}

