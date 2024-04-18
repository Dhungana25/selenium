package com.Automation.SeleniumProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.snapdeal.com");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("//span[text()='Roti Makers']")).click();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[text()='Roti Makers']")));
		
		//js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[text()='Roti Makers']")));
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Screenshot = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot,new File ("screenshot//snapdeal.jpg"));
		
		
	}
}
