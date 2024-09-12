package com.browser;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BrowserConfiguration {
	WebDriver driver=null;
	public WebDriver ChromeBrowserSelection(String browser,String URL)
	{
		if(browser.equals("chrome") || browser.equals("Chrome") || browser.equals("CHROME"))
		{
			
			
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		return driver;
	}
	
	public WebDriver EdgeBrowserSelection(String Browser, String Url) 
	{
		if (Browser.equals("edge")||Browser.equals("Edge")||Browser.equals("EDGE")) 
		{
			WebDriverManager.edgedriver().setup();
			
			driver.manage().window().maximize();
			driver=new EdgeDriver();
			driver.get(Url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		return driver;
	}	
	
	public WebDriver firefoxBrowserSelection(String browser,String URL)
	{
		if(browser.equals("firefox") || browser.equals("Firefox") || browser.equals("FIREFOX"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.get(URL);
		}
		return driver;
	}

}
