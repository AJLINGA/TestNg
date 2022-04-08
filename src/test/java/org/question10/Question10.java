package org.question10;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class Question10 extends BaseClass {
	
	@BeforeClass
	private void befAll() {
		openChromeBrowser();
		launchUrl("https://demoqa.com/automation-practice-form");
		maxWindow();

	}
	
	@Test
	private void tc() {
		
		driver.findElement(By.id("firstName")).sendKeys("Jayalingam");
		driver.findElement(By.id("lastName")).sendKeys("A");
		driver.findElement(By.id("userEmail")).sendKeys("lingajdish@gmail.com");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9677525444");
		
		
		
		
		
	}

}
