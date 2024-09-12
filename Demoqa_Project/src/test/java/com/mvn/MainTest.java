package com.mvn;


import org.apache.commons.lang3.ObjectUtils.Null;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.browser.BrowserConfiguration;
import com.modules.ElementCheckBox;
import com.modules.ElementRedioButton;
import com.modules.ElementTextBox;

public class MainTest {
	WebDriver driver=null;
	
	ElementTextBox et= null;
	ElementCheckBox ec=null;
	ElementRedioButton er=null;
	
@BeforeClass
	public void loadBrowser() throws InterruptedException
	{
		driver=new BrowserConfiguration().ChromeBrowserSelection("chrome", "https://demoqa.com/");
		Thread.sleep(3000);
	}

@BeforeTest
public void beforeTest() {
	et=new ElementTextBox();
	ec= new ElementCheckBox();
	er=new ElementRedioButton();
}

@Ignore
@Test(priority = 1)
public void textBoxDetails() throws InterruptedException {
	et.clickElement(driver);
	et.enterFullname(driver, "Swara Shah");
	et.enterEmail(driver, "Swara@gmail.com");
	et.enterAddress(driver, "Surat", "Vadodara");
	et.clickSubmit(driver);
}

@Ignore
@Test(priority = 2)
public void checkboxDetails() throws InterruptedException {
	ec.clickElement(driver);
	ec.clickCheckbox(driver);
}


@Test(priority = 3)
public void radioButtonDetails() throws InterruptedException {
	er.clickElement(driver);
	er.clickRedioButton(driver);
}


//@Ignore
//@AfterClass
//public void closeBrowser() throws InterruptedException
//{
//	Thread.sleep(3000);
//	driver.close();		
//}
}
