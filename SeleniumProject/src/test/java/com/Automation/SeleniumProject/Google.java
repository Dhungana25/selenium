package com.Automation.SeleniumProject;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	//driver.findElement(By.id("email")).sendKeys("");
	//driver.findElement(By.id("pass")).sendKeys("");
	//driver.findElement(By.name("login")).click();
	
	//WebDriverManager.chromedriver().setup();
	//WebDriver driver = new ChromeDriver();
	//driver.get("https://www.google.com/");
	
	
}
}
