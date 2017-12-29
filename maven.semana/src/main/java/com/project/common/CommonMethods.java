package com.project.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods{
	public enum browserType{Firefox, Chrome, Iexplorer}
	public static WebDriver driver;
	
	public void openBrowser(browserType Browser)
	{

		switch (Browser)
		{
			case Firefox:
				System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		        driver = new FirefoxDriver();        
				break;
			case Iexplorer:
				break;
			case Chrome:
				break;
			default:
				System.out.println( "Error: Browser not defined" );
		}
	}
	public void getUrl(String URL)
	{
		driver.get(URL);
	}
	
	public void CloseBrowser()
	{
		driver.quit();
	}
}
