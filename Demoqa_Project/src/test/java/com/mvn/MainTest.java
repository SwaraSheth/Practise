package com.mvn;


import org.apache.commons.lang3.ObjectUtils.Null;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.browser.BrowserConfiguration;
import com.modules.AFWAlerts;
import com.modules.AFWBrowserWindows;
import com.modules.AFWFrames;
import com.modules.AFWModalDiologs;
import com.modules.ElementBrokenLinks;
import com.modules.ElementButtons;
import com.modules.ElementCheckBox;
import com.modules.ElementDynamic;
import com.modules.ElementLinks;
import com.modules.ElementRedioButton;
import com.modules.ElementTextBox;
import com.modules.ElementUploadDownload;
import com.modules.ElementWebTable;
import com.modules.FormPractise;
import com.modules.WidgetsAccordian;

public class MainTest {
	WebDriver driver=null;
	
	ElementTextBox et= null;
	ElementCheckBox ec=null;
	ElementRedioButton er=null;
	ElementWebTable ew=null;
	ElementButtons eb=null;
	ElementLinks el=null;
	ElementBrokenLinks ebl=null;
	ElementUploadDownload eud=null;
	ElementDynamic ed=null;
	FormPractise fp=null;
	
	AFWBrowserWindows abw=null;
	AFWAlerts aa=null;
	AFWFrames af=null;
	AFWModalDiologs amd=null;
	
	WidgetsAccordian wa=null;
	
	
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
	ew=new ElementWebTable();
	eb=new ElementButtons();
	el=new ElementLinks();
	ebl=new ElementBrokenLinks();
	eud=new ElementUploadDownload();
	ed=new ElementDynamic();
	fp=new FormPractise();
	
	abw=new AFWBrowserWindows();
	aa=new AFWAlerts();
	af=new AFWFrames();
	amd=new AFWModalDiologs();
	
	wa=new WidgetsAccordian();
	
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

@Ignore
@Test(priority = 3)
public void radioButtonDetails() throws InterruptedException {
	er.clickElement(driver);
	er.clickRedioButton(driver);
}

@Ignore
@Test(priority = 4)
public void webtableDetails() throws InterruptedException {
	ew.clickElement(driver);
	ew.addTable(driver, "Swara", "Shah", "swara@gmail.com", "30", "100000", "CE");
}

@Ignore
@Test(priority = 5)
public void buttonsDetails() throws InterruptedException {
	eb.clickElement(driver);
	eb.buttonClick(driver);
}

@Ignore
@Test(priority = 6)
public void linksDetails() throws InterruptedException {
	el.clickElement(driver);
	el.clickLinks(driver);
}

@Ignore
@Test(priority = 7)
public void brokenlinksDetails() throws InterruptedException {
	ebl.clickElement(driver);
	ebl.clickBrokenlinks(driver);

}

@Ignore
@Test(priority = 8)
public void uploadDownloadDetails() throws InterruptedException {
	eud.clickElement(driver);
	eud.uploadImage(driver);
	eud.downloadImage(driver);
}

@Ignore
@Test(priority = 9)
public void dynamicDetails() throws InterruptedException {
	ed.clickElement(driver);
	ed.dynamicClick(driver);
	
}

@Ignore
@Test(priority = 9)
public void formDetails() throws InterruptedException {
	fp.clickElement(driver);
	fp.formFillUp(driver);
	
}

@Ignore
@Test(priority = 10)
public void browserWindowsDetails() throws InterruptedException {
	abw.clickElement(driver);
	abw.browserWindows(driver);
	
}

@Ignore
@Test(priority = 11)
public void alertsDetails() throws InterruptedException {
	aa.clickElement(driver);
	aa.alerts(driver);
	
}

@Ignore
@Test(priority = 12)
public void framesDetails() throws InterruptedException {
	af.clickElement(driver);
	
}

@Ignore
@Test(priority = 13)
public void modalDiologsDetails() throws InterruptedException {
	amd.clickElement(driver);
	amd.modelDiologs(driver);
}

@Test(priority = 14)
public void accordianDetails() throws InterruptedException {
	wa.clickElement(driver);
	wa.accordianClick(driver);
}

//@Ignore
//@AfterClass
//public void closeBrowser() throws InterruptedException
//{
//	Thread.sleep(3000);
//	driver.close();		
//}
}
