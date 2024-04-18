package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignments102 {
  public static void main(String[] args) {
	  ChromeDriver driver= new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	 WebElement login= driver.findElement(By.xpath("//span[.='Login']"));
	 Actions a1= new Actions(driver);
	 a1.moveToElement(login).perform();
	WebElement signin= driver.findElement(By.xpath("//span[.='Sign Up']"));
	signin.click();
	WebElement mobile_tf=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	mobile_tf.sendKeys("912456234563");
	WebElement continue_button= driver.findElement(By.xpath("//span[.='CONTINUE']"));
	continue_button.click();
	WebElement opt_button= driver.findElement(By.xpath("//button[.='Request OTP']"));
	opt_button.click();
	
	
	
	
	
	 
	 
	  
	
}
}
