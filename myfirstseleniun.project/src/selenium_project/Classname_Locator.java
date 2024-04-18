package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignments107
public class Classname_Locator {
  public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement element= driver.findElement(By.className("gLFyf"));
	element.sendKeys("hyderabad");
}
}
