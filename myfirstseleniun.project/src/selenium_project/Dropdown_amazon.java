package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_amazon {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement dropdown= driver.findElement(By.xpath("(//select)[1]"));
	
  Select s1=new Select(dropdown);
  //s1.selectByIndex(10);
  //s1.selectByVisibleText("Garden & Outdoors");
  s1.selectByValue("search-alias=digital-music");
  
  
  
	}

}
