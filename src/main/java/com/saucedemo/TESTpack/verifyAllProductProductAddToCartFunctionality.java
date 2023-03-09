package com.saucedemo.TESTpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.saucedemo.POMpack.HomePOMClass;



public class verifyAllProductProductAddToCartFunctionality extends  TestBaseClass
{
	@Test
	public void verifyallproduct()

	{

		//bag product add to cart
		HomePOMClass hp = new HomePOMClass(driver);

		hp.clickOnBagProduct();
		log.info("Clicked on bag product");

		log.info("Apply the validation");

		String expectedProductSelected = "1";

		String actualProductSelected = hp.getTextFromAddToCart();

		if(expectedProductSelected.equals(actualProductSelected))
		{
			log.info("Bag Add to cart test case is passed");
		}
		else
		{
			log.info("Bag Add to cart test case is failed");
		}




	}

}


