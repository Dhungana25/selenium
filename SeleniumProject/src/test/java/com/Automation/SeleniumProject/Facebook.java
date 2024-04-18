package com.Automation.SeleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("");
		//driver.findElement(By.id("pass")).sendKeys("");
		//driver.findElement(By.name("login")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nancy");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nancy@20");
				
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("16683545673");
		
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("saru@20");
		
		driver.findElement(By.id("month")).sendKeys("Feb");
		driver.findElement(By.id("day")).sendKeys("10");
		driver.findElement(By.id("year")).sendKeys("1995");
		
		WebElement RadioButton1=driver.findElement(By.xpath("//label[normalize-space()='Female']"));
		RadioButton1.click();
		
		WebElement RadioButton2=driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		RadioButton2.click();
	
		WebElement RadioButton3=driver.findElement(By.xpath("//label[normalize-space()='Custom']"));
		RadioButton3.click();
		
	    //driver.findElement(By.xpath("//select[@name='preferred_pronoun']")).sendKeys("She:Wish her a happy birthday!");
		//driver.findElement(By.xpath("//select[@name='preferred_pronoun']")).sendKeys("He:Wish him a happy birthday!");
		
		driver.findElement(By.xpath("//select[@name='preferred_pronoun']")).sendKeys("Them:Wish them a happy birthday!");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.name("//input[@name='custom_gender']")).sendKeys("Female");
		
		
	}

}
