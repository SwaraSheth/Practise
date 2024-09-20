package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ElementDynamic {
	
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		Actions action=new Actions(driver);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		action.click().perform();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
		Thread.sleep(5000);
		
		WebElement element2=driver.findElement(By.xpath("//*[@id=\"item-8\"]/span"));
		js.executeScript("arguments[0].scrollIntoView();", element2);
		driver.findElement(By.xpath("//*[@id=\"item-8\"]/span")).click();
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,400)");
	}
	
	@Test(priority = 2)
	public void dynamicClick(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("enableAfter")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("colorChange")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("visibleAfter")).click();
		Thread.sleep(2000);
	}
}
