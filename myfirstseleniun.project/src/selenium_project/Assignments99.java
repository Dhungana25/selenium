package selenium_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments99 {
  public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement searchtf= driver.findElement(By.name("q"));
	searchtf.sendKeys("shoe");
	Thread.sleep(2000);
	
	List<WebElement> autosugge= driver.findElements(By.xpath("//li[@class='_3D0G9a']/div/a "));
  int count=	autosugge.size();
	System.out.println(count);
	Thread.sleep(2000);
	autosugge.get(5).click();
	
}
}
//li[@class='_3D0G9a']/div/a 