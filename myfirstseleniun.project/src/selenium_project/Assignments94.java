package selenium_project;
//Launch GroTechMinds.com > register page > enter present address > then control+a > 
//then control+c > then go to permanent address > do control+v.
//Your present address should be copied to your permanent address.

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments94 {
  public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	WebElement tf= driver.findElement(By.xpath("//input[@id='fname']"));
	tf.sendKeys("sarmila.mehta73@gmail.com");
	tf.sendKeys(Keys.CONTROL+"a");
	tf.sendKeys(Keys.CONTROL+"c");
	WebElement tf1= driver.findElement(By.xpath("//input[@id='lname']"));
	tf1.sendKeys(Keys.CONTROL+"v");
	WebElement tf3= driver.findElement(By.xpath("//textarea[@id='Present-Address']"));
	tf3.sendKeys("4567 ester road dr dallas texas");
	tf3.sendKeys(Keys.CONTROL+"a");
	tf3.sendKeys(Keys.CONTROL+"c");
     WebElement tf4= 	driver.findElement(By.xpath("//textarea[@id='Permanent-Address']"));
	tf4.sendKeys(Keys.CONTROL+"V");
	
	
	
	
	
}
}
