package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Assignments87
public class Relative_Xpathfacebook {

	public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	/*WebElement textfield = driver.findElement(By.xpath("(//input)[3]"));
	textfield.sendKeys("sarmila.mehta73@gmail.com");
	WebElement textfield1= driver.findElement(By.xpath("(//input)[4]"));
	textfield1.sendKeys("happy@345");
*/
	WebElement textfield= driver.findElement(By.xpath("//input[@name='email']"));
	textfield.sendKeys("sarmila.mehta73@gmail.com");
	
	WebElement passtext= driver.findElement(By.xpath("//input[@id='pass']"));
	passtext.sendKeys("Happy@345");
	
	WebElement loginbutton= driver.findElement(By.xpath("//button[@id='loginbutton']"));
     loginbutton.click();
     
	
	
	}

}
