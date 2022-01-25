package org.question2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class Question2 extends BaseClass{

	@Test
	private void redBus() throws InterruptedException {
		openChromeBrowser();
		launchUrl("https://www.redbus.in/");
		maxWindow();
		
		driver.findElement(By.id("i-icon-profile")).click();
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
	
		implicitWait(10);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame);
		WebElement txtPhoneNo = driver.findElement(By.id("mobileNoInp"));
		txtPhoneNo.sendKeys("9677525444");
		Assert.assertEquals(txtPhoneNo.getAttribute("value"), "9677525444", "Check Phone No");
	}
	
}
