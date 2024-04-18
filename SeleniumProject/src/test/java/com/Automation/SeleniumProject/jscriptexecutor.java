package com.Automation.SeleniumProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jscriptexecutor {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.redbus.in/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("window.scrollBy(-0,1000)");
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight");
		Thread.sleep(8000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		
	}

}
