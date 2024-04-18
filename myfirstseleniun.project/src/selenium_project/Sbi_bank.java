package selenium_project;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Sbi_bank {
  public static void main(String[] args) throws IOException {
	  ChromeDriver driver= new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	  driver.manage().window().maximize();
	  WebElement loginbutton= driver.findElement(By.xpath("//a[.='New User ? Register here/Activate ']"));
	  loginbutton.click();
	WebElement newuser= driver.findElement(By.xpath("//ul[@class='user_links']"));
	newuser.click();
	Actions a1=new Actions(driver);
	a1.doubleClick(newuser).perform();
	 driver.switchTo().alert().accept();
	WebElement textfield=  driver.findElement(By.id("accountNo"));
	textfield.sendKeys("Sarmila");
	WebElement tf= driver.findElement(By.id("cifNo"));
	tf.sendKeys("1239489");
	WebElement tf2=driver.findElement(By.id("branchCode"));
	tf2.sendKeys("7868");
	WebElement dropdown= driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
	
	Select s1=new Select(dropdown);
	s1.selectByVisibleText("India");
	WebElement tf3= driver.findElement(By.xpath("(//input[@class='form-control'])[5]"));
	tf3.sendKeys("26379917987");
	
	 
	 
}
	
	
	 
}
