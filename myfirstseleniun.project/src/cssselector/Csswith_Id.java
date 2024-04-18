package cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csswith_Id {
  public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement searchtf= driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	searchtf.sendKeys("shoe");
	searchtf.sendKeys(Keys.ENTER);
	
}
}
