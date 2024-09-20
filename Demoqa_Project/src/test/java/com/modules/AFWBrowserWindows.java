package com.modules;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import net.bytebuddy.jar.asm.Handle;

public class AFWBrowserWindows {
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[1]"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]")).click();
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/div/ul/li[1]")).click();
		 js.executeScript("window.scrollBy(0,400)");
	}
	
	public void browserWindows(WebDriver driver) throws InterruptedException {
		String main_w= driver.getWindowHandle();
		System.out.println("main window is :"+main_w);
		driver.findElement(By.id("tabButton")).click();
		Set<String> all_w=driver.getWindowHandles();
		
		Iterator<String> i1=all_w.iterator();
		
		while (i1.hasNext()) {
			String child_w = (String) i1.next();
			System.out.println("all window:-\n"+child_w);
			
			if (!main_w.equals(child_w)) {
				driver.switchTo().window(child_w);
				
				Thread.sleep(2000);
				driver.close();
				}
			}
			driver.switchTo().window(main_w);
			
			String parentHandle=driver.getWindowHandle();
			System.out.println("Parent window:- "+parentHandle);
			driver.findElement(By.id("windowButton")).click();
			Set<String> handles =driver.getWindowHandles();
			
			for(String handle : handles) {
				System.out.println(handle);
				if (!handle.equals(parentHandle)) {
					driver.switchTo().window(handle);
					Thread.sleep(1000);
					driver.close();
				}
			}
			
			
			driver.switchTo().window(parentHandle);
			
			driver.findElement(By.id("messageWindowButton")).click();
			Set<String> handles1 =driver.getWindowHandles();
			for (String handle : handles1) {
				System.out.println(handle);
				if (!handle.equals(parentHandle)) {
					driver.switchTo().window(handle);
					Thread.sleep(1000);
					driver.close();
				}
			}
			driver.switchTo().window(parentHandle);	
			
	}
}
