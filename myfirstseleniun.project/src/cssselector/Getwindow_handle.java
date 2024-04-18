package cssselector;

import java.util.Set;
//Assignments117
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindow_handle {
   public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.google.com");
	driver.manage().window().maximize();
	
	WebElement search_tf= driver.findElement(By.name("q"));
	search_tf.sendKeys("india");
	search_tf.sendKeys(Keys.ENTER);
	String s1= driver.getWindowHandle();
	System.out.println("This is the result of getwindowhandle->" +s1);
	String s2= driver.getWindowHandle();
	System.out.println( "This is the result of getwindowhandles->"+s2);
	   
}
}
