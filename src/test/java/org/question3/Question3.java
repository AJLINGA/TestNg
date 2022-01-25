package org.question3;


import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class Question3 extends BaseClass{
	
	@BeforeClass
	private void befCls() {
		openChromeBrowser();
		launchUrl("https://demoqa.com/automation-practice-form");
		maxWindow();

	}
	
	@Test
	private void demoQa() throws AWTException {
		Question3Pojo pojo = new Question3Pojo();
		
		WebElement firstName = pojo.getTxtFirstName();
		toFillTextBox(firstName, "Jayalingam");
		String fname = firstName.getAttribute("value");
		Assert.assertEquals(fname, "Jayalingam", "First Name");
		
		WebElement lastName = pojo.getTxtLastName();
		toFillTextBox(lastName, "A");
		String lname = lastName.getAttribute("value");
		Assert.assertEquals(lname,"A", "Last Name");
		
		WebElement email = pojo.getTxtEmail();
		toFillTextBox(email, "lingajdish@gmail.com");
		String mail = email.getAttribute("value");
		Assert.assertEquals(mail, "lingajdish@gmail.com", "Mail ID");
		
		WebElement radioMale = pojo.getRadioMale();
		toClickButton(radioMale);
		
		WebElement mobileNo = pojo.getTxtMobileNo();
		toFillTextBox(mobileNo, "9677525444");
		String mobile = mobileNo.getAttribute("value");
		Assert.assertEquals(mobile, "9677525444", "Mobile Number");
		
		WebElement dob = pojo.getTxtDOB();
		dob.click();
		toSelectAll();
		toFillTextBox(dob, "25 Apr 1992");
		toClickEnter();
		String date = dob.getAttribute("value");
		Assert.assertEquals(date, "25 Apr 1992", "Date Of Birth");
		
		//WebElement subject = pojo.getTxtSubject();
		//toFillTextBox(subject, "Computer");
		
		toScroll("arguments[0].scrollIntoView(true)", dob);
		WebElement hobbies = pojo.getTxtHobbies();
		toClickButton(hobbies);
		
		WebElement txtAddress = pojo.getTxtAddress();
		toFillTextBox(txtAddress, "Madurai - TamilNadu");
		
		WebElement txtState = pojo.getTxtState();
		toClickButton(txtState);
		keyDown1();
		
		WebElement txtCity = pojo.getTxtCity();
		toClickButton(txtCity);
		keyDown1();
		
		WebElement btnSubmit = pojo.getBtnSubmit();
		toClickButton(btnSubmit);
		
		
	
	}

}
