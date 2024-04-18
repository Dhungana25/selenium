package cssselector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Count_dropdowngrowtectmind {
  public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.navigate().to("https://grotechminds.com/dropdown/");
	driver.manage().window().maximize();
	WebElement dropdown= driver.findElement(By.xpath("(//select[@id='Choice1'])[1]"));
	Select s1= new Select(dropdown);
	List<WebElement>l1= s1.getOptions();
	int count= l1.size();
	System.out.println(count);
	
	  
	  
}
}
