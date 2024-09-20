package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ElementRedioButton {

	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		Actions action=new Actions(driver);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		action.click().perform();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("item-2")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority = 2)
	public void clickRedioButton(WebDriver driver) throws InterruptedException {
			
		for (int i = 2; i < 4; i++) {
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div["+i+"]/label")).click();
			Thread.sleep(2000);
		}
		
		System.out.println();
		System.out.println("Output of RedioButton is : ");
		WebElement output=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/p/span"));
		System.out.println(output.getText());
		System.out.println();
	}
}
