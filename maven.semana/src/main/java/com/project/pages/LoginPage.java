package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	@FindBy(id="signUpDialogswitchDialogLink")
	private WebElement initSessionButton;

	@FindBy(id="memberLoginDialogemailInputinput")
	private WebElement userName;
	
	@FindBy(id="memberLoginDialogpasswordInputinput")
	private WebElement password;
	
	@FindBy(id="memberLoginDialogokButton")
	private WebElement clickLogin;
	
	
	public LoginPage clickswitcInitSession(){
		initSessionButton.click();
		return this;
	}
	
	public LoginPage setUserName(String user){
		userName.sendKeys(user);
		return this;
	}
	public LoginPage setPassword(String pass){
		password.sendKeys(pass);
		return this;
	}
	
	public LoginPage clickLoginButton(){
		clickLogin.click();
		return this;
	}
}