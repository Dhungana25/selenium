package selenium_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugg_Amazon {
  public static void main(String[] args) throws InterruptedException {
	  ChromeDriver driver= new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	WebElement searchtf=  driver.findElement(By.id("twotabsearchtextbox"));
	searchtf.sendKeys("shoe");
	Thread.sleep(2000);
	List<WebElement> autosuggesation= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	
	int count= autosuggesation.size();
	  System.out.println(count);
	  Thread.sleep(2000);
	  autosuggesation.get(count-7).click();
	  
	  
	  
}
}
