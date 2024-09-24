package com.modules;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AFWAlerts {
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[1]"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]")).click();
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,300)");
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/div/ul/li[2]")).click();
		 WebElement element1=driver.findElement(By.xpath("//*[@id=\"javascriptAlertsWrapper\"]/h1"));
		 js.executeScript("arguments[0].scrollIntoView();", element1);
	}
	
	@Test(priority = 2)
	public void alerts(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		
		Alert a1=driver.switchTo().alert();
		System.out.println("Alert text is : "+a1.getText());
		a1.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		
		Alert a4=driver.switchTo().alert();
		System.out.println("Alert text is : "+a4.getText());
		a1.accept();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		
		Alert a2=driver.switchTo().alert();
		System.out.println("Alert text is : "+a2.getText());
		a1.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		
		Alert a3=driver.switchTo().alert();
		System.out.println("Alert text is : "+a3.getText());
		a1.sendKeys("Swara");
		Thread.sleep(2000);
		a1.accept();
		Thread.sleep(2000);
	}
}
