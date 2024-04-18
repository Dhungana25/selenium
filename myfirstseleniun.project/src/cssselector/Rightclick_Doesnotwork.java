package cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignments114
public class Rightclick_Doesnotwork {

	public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
  driver.manage().window().maximize();
  WebElement loginbutton= driver.findElement(By.linkText("(//a[.='CONTINUE TO LOGIN'])[1]"));
  loginbutton.click();
  WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
  username.sendKeys("Sarmila Dhungana");
  WebElement password= driver.findElement(By.xpath("//input[@id='label2']"));
  password.sendKeys("Happy#456");
  driver.findElement(By.xpath(""));
  
  
	}

}
