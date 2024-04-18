package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//How to handle a java script popups.

public class Assignments96 {

	public static void main(String[] args) {
		
    ChromeDriver  driver = new ChromeDriver();
    driver.get("file:///C:/Users/sarmi/Downloads/learningHTML1by%20manishsir.html");
    driver.manage().window().maximize();
    
    driver.switchTo().alert().accept(); //yes
   // driver.switchTo().alert().dismiss();  //no
    
     WebElement tf= driver.findElement(By.xpath("(/html/body/input)[1]"));
     tf.sendKeys("Sarmila.mehta73@gmail.com");
    WebElement tf1= driver.findElement(By.xpath("(/html/body/input)[2]"));
    tf1.sendKeys("Good morning");
   WebElement tf3= driver.findElement(By.xpath("(/html/body/input)[3]"));
   tf3.sendKeys("Haooy&876");
  WebElement tf4= driver.findElement(By.xpath("(/html/body/form/input)[1]"));
  tf4.sendKeys("Sarmila");
 // WebElement tf5= driver.findElement(By.xpath("(/html/body/form/input)[2]"));
 // tf5.sendKeys("Dhungana");
  
  
   
    
    
     

	}

}
