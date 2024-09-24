package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AFWModalDiologs {
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[1]"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]")).click();
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,300)");
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/div/ul/li[5]")).click();
		 WebElement element1=driver.findElement(By.xpath("//*[@id=\"modalWrapper\"]/h1"));
		 js.executeScript("arguments[0].scrollIntoView();", element1);
		 Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void modelDiologs(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("showSmallModal")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("closeSmallModal")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("showLargeModal")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("closeLargeModal")).click();
		Thread.sleep(3000);
	}
}
