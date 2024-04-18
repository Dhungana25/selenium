package cssselector;
//Assignments113
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csswith_Substring {
	public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	WebElement search_tf= driver.findElement(By.cssSelector("input[id^='two']"));
	search_tf.sendKeys("books");
	search_tf.sendKeys(Keys.ENTER);
	WebElement firstbook= driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
	
	firstbook.click();
	
	
}	

}
