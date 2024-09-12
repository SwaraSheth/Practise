package com.modules;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

public class ElementTextBox {
	
@Test(priority = 1)
public void clickElement(WebDriver driver) throws InterruptedException {
	Actions action=new Actions(driver);
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
	js.executeScript("arguments[0].scrollIntoView();", element);
	action.click().perform();
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
}
	
@Test(priority = 2)
public void enterFullname(WebDriver driver,String name) throws InterruptedException {
	driver.findElement(By.id("userName")).sendKeys(name);
	Thread.sleep(2000);
	}

@Test(priority = 3)
public void enterEmail(WebDriver driver,String email) throws InterruptedException {
		driver.findElement(By.id("userEmail")).sendKeys(email);
		Thread.sleep(2000);
}

@Test(priority = 4)
public void enterAddress(WebDriver driver,String caddress,String paddress) throws InterruptedException {
		driver.findElement(By.id("currentAddress")).sendKeys(caddress);
		Thread.sleep(2000);
		driver.findElement(By.id("permanentAddress")).sendKeys(paddress);
		Thread.sleep(2000);
}

@Test(priority = 5)
public void clickSubmit(WebDriver driver) throws InterruptedException {
	Actions action=new Actions(driver);
	llIntoView();", element);
	action.click().perform();JavascriptExecutor js= (JavascriptExecutor) driver;
	
	WebElement element=driver.findElement(By.id("submit"));
	js.executeScript("arguments[0].scro
	
	driver.findElement(By.id("submit")).click();
	Thread.sleep(2000);
	
	System.out.println();
	System.out.println("Output of TextBox is : ");
	WebElement output=driver.findElement(By.id("output"));
	System.out.println(output.getText());
	System.out.println();
}
}
