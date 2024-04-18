package com.Automation.SeleniumProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class listDropdown {

	public static void main(String[]args) {
		/*
		 * -list
		 * here we need to grab all the values using for loop
		 * and based on if condition, we are gonna select 
		 * 
		 */
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("src")).sendKeys("Ban");
		List<WebElement>srcdrpdwn = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]"));
		for (WebElement s : srcdrpdwn) {
			System.out.println(s.getText());
			
			
			
		}
		
	}

}
