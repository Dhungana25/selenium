package com.Automation.SeleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframes {
	public static void main(String[] args) {
		/*iframe - its is the html inside a html.
		 * 3 ways we can switch to iframe.
		 * 1. name/id
		 * 2. index
		 * 3.findelement.
		 * alerts - popup
		 * 4action
		 * accept=positive flows
		 * dismiss= negetive flows
		 * gettext= get the value from the popup
		 * sendkeys = used to enter the values.
		 *  
		 */
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		driver.switchTo().alert().sendKeys("crowhope");
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		driver.switchTo().defaultContent(); //first frame
		driver.findElement(By.xpath("//a[@onclick=\"retheme()\"]")).click();
		
	
		
	}

}
