package org.question3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class Question3Pojo extends BaseClass{
	
	public Question3Pojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstName")
	private WebElement txtFirstName; 
	
	@FindBy(id="lastName")
	private WebElement txtLastName;
	
	@FindBy(id="userEmail")
	private WebElement txtEmail;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement txtGender;
	
	@FindBy(id="userNumber")
	private WebElement txtMobileNo;
	
	@FindBy(id="dateOfBirthInput")
	private WebElement txtDOB;
	
	@FindBy(id="subjectsContainer")
	private WebElement txtSubject;
	
	@FindBy(xpath="//label[text()='Sports']")
	private WebElement txtHobbies;
	
	@FindBy(id="currentAddress")
	private WebElement txtAddress;
	
	@FindBy(id="state")
	private WebElement txtState;
	
	@FindBy(id="city")
	private WebElement txtCity;
	
	@FindBy(id="submit")
	private WebElement btnSubmit;
	

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getRadioMale() {
		return txtGender;
	}

	public WebElement getTxtMobileNo() {
		return txtMobileNo;
	}

	public WebElement getTxtDOB() {
		return txtDOB;
	}

	public WebElement getTxtSubject() {
		return txtSubject;
	}

	public WebElement getTxtHobbies() {
		return txtHobbies;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtState() {
		return txtState;
	}
	
	public WebElement getTxtCity() {
		return txtCity;
	}
	
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	

}
