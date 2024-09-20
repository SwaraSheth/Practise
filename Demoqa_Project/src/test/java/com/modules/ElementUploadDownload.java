package com.modules;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ElementUploadDownload {
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		Actions action=new Actions(driver);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		action.click().perform();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
		Thread.sleep(5000);
		
		WebElement element2=driver.findElement(By.xpath("//*[@id=\"item-7\"]/span"));
		js.executeScript("arguments[0].scrollIntoView();", element2);
		driver.findElement(By.xpath("//*[@id=\"item-7\"]/span")).click();
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,400)");
	}
	
	@Test(priority = 2)
	public void uploadImage(WebDriver driver) throws InterruptedException {
		WebElement uploadimag=driver.findElement(By.id("uploadFile"));
		uploadimag.sendKeys("C:\\Users\\Admin\\Desktop\\Image.png");
		Thread.sleep(2000);
		WebElement uploadpath=driver.findElement(By.id("uploadedFilePath"));
		System.out.println("Upload image path : "+uploadpath.getText());
		
	}
	
	@Test(priority = 3)
	public void downloadImage(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("downloadButton")).click();
		Thread.sleep(2000);
	}
}
