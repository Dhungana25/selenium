package com.Automation.SeleniumProject;


//import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoautomation {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("nancy");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("nancy@12");
		
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("apple@example.com");
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9865432679");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(1000);
		WebElement stateDropdown = driver.findElement(By.className("css-1uccc91-singleValue"));
	
		Select state_dd = new Select(stateDropdown);
		state_dd.selectByIndex(1);
		
		
		driver.findElement(By.xpath("//label[text()='Sports']")).click();
		//driver.findElement(By.xpath("//label[text()='Reading']")).click();
		//driver.findElement(By.xpath("//label[text()='Music']")).click();
		
		
		WebElement RadioButton1=driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		RadioButton1.click();
		
		WebElement RadioButton2=driver.findElement(By.xpath("//label[normalize-space()='Female']"));
		RadioButton2.click();
		
		//Select State = new Select(driver.findElement(By.xpath("//div[@id='stateCity-wrapper']")));
		//State.selectByVisibleText("Haryana");
		
		
		
		
		driver.findElement(By.id("currentAddress")).sendKeys("4206 Easters road Irving Tx.");
		
		driver.findElement(By.xpath("//div[@id='subjectsContainer']")).sendKeys("Student Form");
		
		
		
		
		
		
		//WebElement RadioButton3=driver.findElement(By.xpath("//label[normalize-space()='Other']]"));
		//RadioButton3.click();
		

		
		

		
		
		

		
		//driver.findElement(By.id("dateOfBirthInput")).click();
		
		
		//WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
		
		//Select month_dd = new Select(monthDropdown);
		//month_dd.selectByIndex(1);
		
		//WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
		
		//Select year = new Select(yearDropdown);
		//year.selectByValue("1999");
		
		
		//driver.findElement(By.className("react-datepicker__day react-datepicker__day--022")).click();
		
		

		
		
		
		
		
		
		
		
		
	
	}
	
}

