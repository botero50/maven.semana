package com.maven.tests;
import com.project.pages.*;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.project.common.CommonMethods;
import com.project.common.publicData;

public class LoginTests extends CommonMethods implements publicData {
	
	@Before
	public void createEnvironment() 
	{
		openBrowser(browserType.Firefox);
		getUrl(publicData.EnvironmentURL + publicData.paginaStore);
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickLoginButton();
	}
	
	@Test
	public void SwitchSession() 
	{

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.clickswitcInitSession();
		loginPage.setUserName("botero50@gmail.com");
		loginPage.setPassword("12345678");
		loginPage.clickLoginButton();
		
		try {Thread.sleep(8000);} catch (InterruptedException e) {e.printStackTrace();}
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		assertEquals("User name is not equal", homePage.getLoggedUserName(), "Hola botero50");
		try {Thread.sleep(4000);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	@After
	public void destroyEnvironment() 
	{
		CloseBrowser();
	}
}
