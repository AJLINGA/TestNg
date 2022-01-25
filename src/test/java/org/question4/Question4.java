package org.question4;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class Question4 extends BaseClass{
	
	@Test
	private void facebook() {
	
		Question4Pojo pojo = new Question4Pojo();
		
		WebElement txtUserName = pojo.getTxtUserName();
		toFillTextBox(txtUserName, "9677525444");
		String userName = txtUserName.getAttribute("value");
		Assert.assertEquals(userName, "9677525444", "To Check UserName");
	
		WebElement txtPassord = pojo.getTxtPassword();
		toFillTextBox(txtPassord, "1234567890");
		String passWord = txtPassord.getAttribute("value");
		Assert.assertEquals(passWord, "1234567890", "To Check Password");

	}
	
	@BeforeClass
	private void befClass() {
		openChromeBrowser();
		launchUrl("https://www.flipkart.com/account/login");
		

	}

}
