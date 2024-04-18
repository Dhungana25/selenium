package selenium_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggesation{
  public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	WebElement searchtf= driver.findElement(By.name("q"));
	searchtf.sendKeys("banglore");
	
	Thread.sleep(2000);
	List<WebElement> autosuggesation= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
  int count= autosuggesation.size();
  System.out.println(count);
  Thread.sleep(3000);
  autosuggesation.get(4).click();   //we can write count-6 inistead of 4.
  
}
}
