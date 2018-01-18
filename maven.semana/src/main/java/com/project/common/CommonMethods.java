package com.project.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;;

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
				System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				break;
			case Chrome:
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				driver = new ChromeDriver(); 
				break;
			default:
				System.out.println( "Error: Browser not defined" );
		}
		driver.manage().window().maximize();
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
