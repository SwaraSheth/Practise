package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ElementCheckBox {
	
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		Actions action=new Actions(driver);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		action.click().perform();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"item-1\"]/span")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority = 2)
	public void clickCheckbox(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]")).click();
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label")).click();
		Thread.sleep(5000);
		
		System.out.println();
		System.out.println("Output of CheckBox is : ");
		WebElement out=driver.findElement(By.id("result"));
		System.out.println(out.getText());
		System.out.println();
		
	}
}
