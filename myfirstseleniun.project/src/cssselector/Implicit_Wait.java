package cssselector;
//Assignments115
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {
  public static void main(String[] args) {
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  //WebElement search_tf= driver.findElement(By.xpath("sarmila"));//it will give no such element exception
	  WebElement search_tf= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	  search_tf.sendKeys("Australia");
	  search_tf.sendKeys(Keys.ENTER);
	  
	  
	  
}
}
