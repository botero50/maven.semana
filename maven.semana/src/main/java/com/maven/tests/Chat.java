package com.maven.tests;
import com.project.pages.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.project.common.CommonMethods;
import com.project.common.publicData;

public class Chat extends CommonMethods implements publicData {
	
	@Before
	public void createEnvironment() 
	{
		openBrowser(browserType.Firefox);
	}
	
	@Test
	public void testingEmail() 
	{
		getUrl(publicData.EnvironmentURL + publicData.paginaContactenos);
		ContactenosPage contactenosPage = PageFactory.initElements(driver, ContactenosPage.class);
		contactenosPage.fillEmail("test@test.com");
	}
	
	@After
	public void destroyEnvironment() 
	{
		CloseBrowser();
	}
}
