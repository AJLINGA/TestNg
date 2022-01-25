package org.question4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class Question4Pojo extends BaseClass{

	public Question4Pojo() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement txtUserName;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtPassword;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}
	
	
	
}
