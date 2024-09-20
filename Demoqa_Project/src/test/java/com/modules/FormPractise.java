package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FormPractise {
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]")).click();
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[2]/div")).click();
		 js.executeScript("window.scrollBy(0,500)");
	}
	
	@Test(priority = 2)
	public void formFillUp(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		WebElement element=driver.findElement(By.id("firstName"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		driver.findElement(By.id("firstName")).sendKeys("Swara");
		Thread.sleep(2000);
		
		driver.findElement(By.id("lastName")).sendKeys("Shah");
		Thread.sleep(2000);
		
		driver.findElement(By.id("userEmail")).sendKeys("Swara@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("userNumber")).sendKeys("0123456789");
		Thread.sleep(2000);
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(2000);
		
		WebElement birthmonth=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select s1=new Select(birthmonth);
		s1.selectByValue("1");
		
		WebElement birthyear=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select s2=new Select(birthyear);
		s2.selectByValue("1994");
		
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("subjectsInput")).sendKeys("Software Testing");
		Thread.sleep(2000);
		
		 
		driver.findElement(By.id("currentAddress")).sendKeys("Surat");
		Thread.sleep(2000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 js2.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		 driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Rajasthan']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[2]/div")).click();
		 Thread.sleep(2000);	
		 driver.findElement(By.xpath("//div[text()='Jaipur']")).click();
		 Thread.sleep(2000);
		 
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		
		
		
	}
}
