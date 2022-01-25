package org.question7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question7 {
	
	WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	private void tc(String browser) {
		
		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.flipkart.com/account/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9677525444");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123567890");

	}

}
