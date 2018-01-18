package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	@FindBy(id="comp-jbsd9jymactionTitle")
	private WebElement loginButton;
	
	@FindBy(className="lgn0memberTitle")
	private WebElement logginUserName;
	
	public HomePage clickLoginButton()
	{
		loginButton.click();
		return this;
	}
	
	public String getLoggedUserName()
	{
		return logginUserName.getText();
	}
}