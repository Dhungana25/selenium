package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//lunch google type india arrow down 4 time and press enter button.
public class Assignments93 {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement search_tf= driver.findElement(By.xpath("(//textarea)[1]"));
	search_tf.sendKeys("India");
	
	search_tf.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	search_tf.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	search_tf.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	search_tf.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	search_tf.sendKeys(Keys.ENTER);
	

	}

}
