package org.question1;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class Question1 extends BaseClass {
	@Test
	private void login() {
		FbLoginPojo fb = new FbLoginPojo();
		
		WebElement txtEmail = fb.getTxtEmail();
		toFillTextBox(txtEmail, "lingajdish@gmail.com");
		Assert.assertEquals(txtEmail.getAttribute("value"), "lingajdish@gmail.com","Check User Name");
		
		WebElement txtPass = fb.getTxtPass();
		toFillTextBox(txtPass, "1234567890");
		Assert.assertEquals(txtPass.getAttribute("value"), "1234567890","check Password");
		
		System.out.println("expected output came");
	}
	
	@BeforeClass
	private void befClass() {
		openChromeBrowser();
		launchUrl("https://www.facebook.com/");
		// git checking

	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
