package com.Automation.SeleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectDropdown {


	public static void main(String[] args) {
	/**
	 * select - tagname
	 * Selenium - select is a class
	 * all the logics
	 * 3 ways
	 * 1)select by index
	 * 2) select by value
	 * 3) select by visible text
	 */ 
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://admin-demo.nopcommerce.com/Admin/Order/ShipmentList");
	driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")).click();
	Select countydropdown = new Select(driver.findElement(By.xpath("//select[@name=\"CountryId\"]")));
	//countydropdown.selectByIndex(15);//it will start with the 0. 
	//countydropdown.selectByValue("10");
    countydropdown.selectByVisibleText("China");
	 
    
	
    
    
    
    
    
    }
	 
	 
	 

}
