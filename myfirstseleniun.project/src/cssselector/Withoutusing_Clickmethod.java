package cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignments119
public class Withoutusing_Clickmethod {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https:www.google.com");
         driver.manage().window().maximize();
      WebElement gmail=   driver.findElement(By.xpath("(//a[.='Gmail'])[1]"));
      gmail.sendKeys(Keys.ENTER);
      
      
	}

}
