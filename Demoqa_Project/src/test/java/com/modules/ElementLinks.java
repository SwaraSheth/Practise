package com.modules;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ElementLinks {
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		Actions action=new Actions(driver);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		action.click().perform();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
		Thread.sleep(5000);
		
		WebElement element2=driver.findElement(By.xpath("//*[@id=\"item-5\"]/span"));
		js.executeScript("arguments[0].scrollIntoView();", element2);
		driver.findElement(By.xpath("//*[@id=\"item-5\"]/span")).click();
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,400)");
	}
	
	@Test(priority = 2)
	public void clickLinks(WebDriver driver) throws InterruptedException {
		
		String m_window=driver.getWindowHandle();
		System.out.println("main window is : "+m_window);
		
		driver.findElement(By.id("simpleLink")).click();
		Set<String> all_window=driver.getWindowHandles();
		
		Iterator<String> i1=all_window.iterator();
		
		while (i1.hasNext()) {
			String child_window = (String) i1.next();
			System.out.println("all wimdow " +child_window);
			if (!m_window.equals(child_window)){
				driver.switchTo().window(child_window);
				
				Thread.sleep(2000);
				driver.close();
			}
			
			driver.switchTo().window(m_window);
			Thread.sleep(2000);
		}
		
		driver.findElement(By.id("dynamicLink")).click();
		Set<String> all_window1=driver.getWindowHandles();
		
		Iterator<String> i2=all_window.iterator();
		
		while (i2.hasNext()) {
			String child_window = (String) i2.next();
			System.out.println("all wimdow " +child_window);
//			if (!m_window.equals(child_window)){
//				driver.switchTo().window(child_window);
//				
//				Thread.sleep(2000);
//				driver.close();
//			}
			
			driver.switchTo().window(m_window);
			Thread.sleep(2000);
		}
		
		driver.findElement(By.id("created")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("no-content")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("moved")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("bad-request")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("unauthorized")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("forbidden")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("invalid-url")).click();
		Thread.sleep(1000);
		
	}
}
