package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ElementButtons {
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		Actions action=new Actions(driver);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		action.click().perform();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
		Thread.sleep(5000);
		
		WebElement element2=driver.findElement(By.xpath("//*[@id=\"item-4\"]/span"));
		js.executeScript("arguments[0].scrollIntoView();", element2);
		driver.findElement(By.xpath("//*[@id=\"item-4\"]/span")).click();
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,350)");
	}
	
	@Test(priority = 2)
	public void buttonClick(WebDriver driver) throws InterruptedException {
		Actions actions=new Actions(driver);
		WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
		actions.moveToElement(doubleclick).doubleClick().perform();
		Thread.sleep(2000);
		
		WebElement contexclick=driver.findElement(By.id("rightClickBtn"));
		actions.moveToElement(contexclick).contextClick().perform();
		Thread.sleep(2000);
		
		WebElement click=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/button"));
		actions.moveToElement(click).click().perform();
		Thread.sleep(2000);
		
		WebElement text1=driver.findElement(By.id("doubleClickMessage"));
		System.out.println(text1.getText());
		WebElement text2=driver.findElement(By.id("rightClickMessage"));
		System.out.println(text2.getText());
		WebElement text3=driver.findElement(By.id("dynamicClickMessage"));
		System.out.println(text3.getText());
		
	}
}
