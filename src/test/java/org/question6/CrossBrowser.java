package org.question6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	
	WebDriver driver;
	
	@Parameters({"browName"})
	@Test
		private void tc1(String browName) {
	
		if (browName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		
		else  {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}

		
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
	}
}