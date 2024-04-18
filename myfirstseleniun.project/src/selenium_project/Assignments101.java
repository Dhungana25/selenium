package selenium_project;
//hoverover
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Assignments101 {
  public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	 WebElement EN= driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[1]"));
	 
	 Actions a1=new Actions(driver);
	 a1.moveToElement(EN).perform();
	//WebElement signin= driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
	//signin.click();
	 
	//div[.='Hello, sign in'] for account n list xpath
}
}
