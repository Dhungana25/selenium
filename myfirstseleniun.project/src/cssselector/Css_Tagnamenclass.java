package cssselector;
//Assignments109
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Tagnamenclass {
  public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement search_tf= driver.findElement(By.cssSelector("textarea.gLFyf"));
	search_tf.sendKeys("texas");
	search_tf.sendKeys(Keys.ENTER);
	
	
	  
}
}
