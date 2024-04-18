package com.Automation.SeleniumProject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get("https://www.openmultipleurl.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("list_urls")).sendKeys("https://www.google.com/\r\n");
		driver.findElement(By.id("list_urls")).sendKeys("https://www.amazon.com/\r\n");
		driver.findElement(By.id("list_urls")).sendKeys("https://www.facebook.com/\r\n");
		
		driver.findElement(By.xpath("//input[@value=\"Go Now\"]"));
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String parentwindow = driver.getWindowHandle();
		Set<String>allwindows = driver.getWindowHandles();
		
		for(String a : allwindows) {
			if(!a.equals(parentwindow)) {
				driver.switchTo().window(a);
				
			}
			
		}
		
	}

}
