package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WidgetsAccordian {
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[1]"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]")).click();
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,400)");
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[1]")).click();
		 WebElement element1=driver.findElement(By.xpath("//*[@id=\"accordianContainer\"]/h1"));
		 js.executeScript("arguments[0].scrollIntoView();", element1);
		 Thread.sleep(3000);
	}
	
	
	public void accordianClick(WebDriver driver) throws InterruptedException {
			JavascriptExecutor js= (JavascriptExecutor) driver;
			WebElement element=driver.findElement(By.id("section1Heading"));
			js.executeScript("arguments[0].scrollIntoView();", element);
			driver.findElement(By.id("section2Heading")).click();
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy(0,90)");
			driver.findElement(By.id("section3Heading")).click();
			Thread.sleep(3000);
	}
}
