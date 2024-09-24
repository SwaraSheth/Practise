package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AFWFrames {
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[1]"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]")).click();
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,300)");
		 
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/div/ul/li[3]")).click();
		 WebElement element1=driver.findElement(By.xpath("//*[@id=\"framesWrapper\"]/h1"));
		 js.executeScript("arguments[0].scrollIntoView();", element1);
		 Thread.sleep(2000);
		 
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/div/ul/li[4]")).click();
		WebElement element2=driver.findElement(By.xpath("//*[@id=\"framesWrapper\"]/h1"));
		js.executeScript("arguments[0].scrollIntoView();", element2);
		 Thread.sleep(2000);
	}
	
	
}
