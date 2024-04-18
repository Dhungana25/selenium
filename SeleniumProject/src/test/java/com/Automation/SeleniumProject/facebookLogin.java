package com.Automation.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookLogin {
	public static void main(String[] args) {
	

			//Create instance of ChromeOptions Class
			ChromeOptions handlingSSL = new ChromeOptions();

			//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
			handlingSSL.setAcceptInsecureCerts(true);
					
			//Creating instance of Chrome driver by passing reference of ChromeOptions object
			WebDriver driver = new ChromeDriver(handlingSSL);
			
			//Launching the URL
			driver.get("http://www.saucedemo.com/");
			System.out.println("The page title is : " +driver.getTitle());
			driver.quit();
		}
		
	
}
